// 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
package programmers.lv1.operation;

import programmers.lv1.operation.Factorization;

public class DivisorNumberSum {
    // Between left to right, if number’s divisor is even add. odd sub.
    // 1<= left <= right <= 1,000.
    public int divisorNumberSum(int left, int right){
        Factorization factorization = new Factorization();
        int sum = 0;
        for(int i = left; i <= right; i++){
            if(factorization.factorization(i).size()%2 == 0){
                sum += i;
            }
            else{
                sum -= i;
            }
        }
        return sum;
    }
}
