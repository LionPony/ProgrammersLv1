// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class DescendString {
    // Order String in descending order.
    public String descendString(String s){
        String[] letters = s.split("");
        Arrays.sort(letters, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for(String i : letters){
            result.append(i);
        }
        return result.toString();
    }
}
