// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
package programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;

public class IntNaturalOrder {
    // Descent order n's digits.
    // 1<= n < 8,000,000,000
    public long intNaturalOrder(long n){
        ArrayList<Long> digits = new ArrayList<>();
        while(n != 0){
            digits.add(n%10);
            n /= 10;
        }

        digits.sort(Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();
        for(long i : digits){
            result.append(i);
        }

        return Long.parseLong(result.toString());
    }
}
