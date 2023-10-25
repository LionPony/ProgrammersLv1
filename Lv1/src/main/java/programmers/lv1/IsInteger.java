// 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
package programmers.lv1;

public class IsInteger {
    // Determine String length is 4 or 6 and only contains num.
    public boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return s.length() == 4 || s.length() == 6;
        }
        catch(Exception ex){
            return false;
        }
    }
}
