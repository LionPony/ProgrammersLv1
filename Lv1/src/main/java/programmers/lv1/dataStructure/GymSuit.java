// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
package programmers.lv1.dataStructure;

public class GymSuit {
    /**
     * Some of the students lost there gymsuit.
     * Some others have reseve so they can hand over them.
     * But gymsuit has size they can only lend front and back.
     * Figure out the most count of get gymsuit.
     * @param n Number of the Students
     * @param lost Who lost gymsuit.
     * @param reserve Who has spare gymsuit.
     * @return As much as possible students get gymsuit.
     */
    public int gymSuit(int n, int[] lost, int[] reserve){
        // Preprocessing
        boolean[][] gymSuit = new boolean[n][2];
        for(int i = 0; i < gymSuit.length; i++){
            gymSuit[i][0] = true;
        }
        for(int i : lost){
            gymSuit[i-1][0] = false;
        }
        for(int i : reserve){
            gymSuit[i-1][1] = true;
        }

        // Double linked list.
        StudentList studentList = new StudentList();
        for(boolean[] i : gymSuit){
            Student student = new Student(i[0], i[1]);
            studentList.add(student);
        }

        studentList.getOn();
        studentList.distribute();
        return studentList.count();
    }
    public static class Student{
        boolean gymSuit;
        boolean reserve;
        Student next;
        Student prev;
        public Student(boolean gymSuit, boolean reserve){
            this.gymSuit = gymSuit;
            this.reserve = reserve;
            this.next = null;
            this.prev = null;
        }

        public boolean hasNext() {
            return next != null;
        }
    }
    public static class StudentList{
        Student head;
        int length;
        public StudentList(){
            this.length = 0;
            this.head = null;
        }
        public void add(Student student){
            if(length == 0){
                head = student;
            }
            else {
                Student scan = head;
                while (scan.hasNext()){
                    scan = scan.next;
                }
                student.prev = scan;
                scan.next = student;
            }
            length++;
        }

        // If student has spare. Get on it.
        public void getOn(){
            Student scan = head;
            while (scan != null){
                if(!scan.gymSuit){
                    if(scan.reserve){
                        scan.reserve = false;
                        scan.gymSuit = true;
                    }
                }
                scan = scan.next;
            }
        }

        // Find out spare from front and back.
        public void distribute(){
            Student scan = head;
            while (scan != null){
                if(!scan.gymSuit){
                    if(scan.prev != null && scan.prev.reserve) {
                        scan.prev.reserve = false;
                        scan.gymSuit = true;
                    }
                    else if (scan.next != null && scan.next.reserve) {
                        scan.next.reserve = false;
                        scan.gymSuit = true;
                    }
                }
                scan = scan.next;
            }
        }

        // If student has gymsuit count on.
        public int count(){
            int count = 0;
            Student scan = head;
            while (scan != null){
                if(scan.gymSuit){
                    count++;
                }
                scan = scan.next;
            }
            return count;
        }
    }
}