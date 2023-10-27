// 서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
package programmers.lv1.dataStructure;

public class FindKimInSeoul {
    // In String array seoul, find Kim index and return "김서방은 index에 있다"
    // 1 <= seoul.length <= 1000
    // Elements length in seoul are more than 1, under 20.
    // "Kim" is must in seoul.
    public String findKimInSeoul(String[] seoul){
        int index = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        sb.append(index);
        sb.append("에 있다");
        return sb.toString();
    }
}
