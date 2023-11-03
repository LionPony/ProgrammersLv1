// [1차] 다트 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17682
package programmers.lv1.dataStructure;

import java.util.StringTokenizer;

public class DartGame {
    /**
     * Calculate String dartResult.
     * @param dartResult example:1S2D*3T, 1 is score, char is powers, # or * is option.
     * @return Answer of operation.
     */
    public int dartGame(String dartResult){
        ScoreList scoreList = new ScoreList();

        StringTokenizer options = new StringTokenizer(dartResult.replaceAll("[0-9]", " "));
        StringTokenizer numbers = new StringTokenizer(dartResult.replaceAll("[A-Z]|[#|*]", " "));

        while(numbers.hasMoreTokens()){
            int number = Integer.parseInt(numbers.nextToken());
            String letters = options.nextToken();

            char bonus = letters.charAt(0);
            String option = "";
            if(letters.length() > 1){
                option = String.valueOf(letters.charAt(1));
            }

            Score newScore = new Score(number, bonus, option);
            scoreList.add(newScore);
        }

        return scoreList.getTotals();
    }
    public static class Score{
        Score prev;
        Score next;
        int score;
        String option;
        char bonus;
        public Score(int score, char bonus, String option){
            this.score = score;
            this.bonus = bonus;
            this.option = option;
        }
        public Score(int score, char bonus){
            this.score = score;
            this.bonus = bonus;
            this.option = "";
        }
        public Score getNext(){
            return this.next;
        }
        public Score getPrev(){
            return this.prev;
        }
        public int getTotal(){
            int sum = score;

            if(bonus == 'S'){
                sum = (int)Math.pow(sum, 1);
            }
            else if(bonus == 'D'){
                sum = (int)Math.pow(sum, 2);
            }
            else if(bonus == 'T'){
                sum = (int)Math.pow(sum, 3);
            }

            String[] options = option.split("");
            for(String opt : options){
                if(opt.equals("#")){
                    sum *= -1;
                }
                else if(opt.equals("*")){
                    sum *= 2;
                }
            }

            return sum;
        }
        public boolean hasNext(){
            return next != null;
        }
    }
    public static class ScoreList{
        Score head;
        int length;
        public ScoreList(){
            this.length = 0;
        }
        public void add(Score newScore){
            if(length == 0){
                head = newScore;
            }
            else{
                Score scan = head;
                while(scan.hasNext()){
                    scan = scan.getNext();
                }
                newScore.prev = scan;
                scan.next = newScore;
            }
            length++;
        }
        public int getTotals(){
            Score scan = head;
            while(scan != null){
                if(scan.option.equals("*")){
                    // Exception handle.
                    if(scan.prev != null) {
                        scan.prev.option = scan.prev.option + "*";
                    }
                }
                scan = scan.getNext();
            }

            int sum = 0;
            scan = head;
            while (scan != null){
                sum += scan.getTotal();
                scan = scan.getNext();
            }

            return sum;
        }
    }
}