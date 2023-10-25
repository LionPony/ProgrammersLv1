// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932
package programmers.lv1;

import java.util.ArrayList;

public class ReverseNumberMakeArray {
    // Reverse n and make array of every digit.
    // n is natural number under 10,000,000,000
    public int[] reverseNumberMakeArray(long n){
        ArrayList<Long> digits = new ArrayList<>();
        while(n > 0){
            digits.add(n%10);
            n /= 10;
        }

        int[] result = new int[digits.size()];
        for(int i = 0; i < digits.size(); i++){
            result[i] = digits.get(i).intValue();
        }
        return result;
    }
}
