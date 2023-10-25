// 문자열 내 p와 y의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
package programmers.lv1;

public class PYCountInString {
    // Count p and y in String. Ignore Upper or lower.
    // if p, y counts are same return true.
    public boolean pyCountInString(String s){
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'p' || letter == 'P'){
                pCount++;
            } else if (letter == 'y'|| letter == 'Y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}
