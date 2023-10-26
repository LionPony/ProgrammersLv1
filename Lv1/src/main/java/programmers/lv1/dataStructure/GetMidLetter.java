// 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
package programmers.lv1.dataStructure;

public class GetMidLetter {
    // Get mid letter of word s.
    // If s.length is even, return 2 letter.
    // 1 <= s.length <= 100.
    public String getMidLetter(String s){
        if(s.length()%2 == 0){
            StringBuilder result = new StringBuilder();
            result.append(s.charAt(s.length()/2 -1 ));
            result.append(s.charAt(s.length()/2));
            return result.toString();
        }
        else {
            return String.valueOf(s.charAt(s.length()/2));
        }

    }
}
