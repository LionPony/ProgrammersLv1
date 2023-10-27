// 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982
package programmers.lv1.operation;

import java.util.Arrays;

public class Budget {
    // 1<= Budget <= 10,000,000
    // d is required money list.
    // At maximum how many d can be required.
    public int budget(int[] d, int budget){
        // Try to put the smallest first.
        Arrays.sort(d);

        int sum = 0;
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            if(sum > budget){
                return i;
            } else if (sum == budget) {
                return i+1;
            }
        }
        return d.length;
    }
}
