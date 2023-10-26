// 약수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

package programmers.lv1.operation;

import programmers.lv1.operation.Factorization;

import java.util.ArrayList;

public class SumOfDivisor {
    // Sum of divisors.
    // 0 <= n <= 3000
    public int sumofDivisor(int n){
        Factorization factorization = new Factorization();
        ArrayList<Integer> factors = factorization.factorization(n);

        int sum = 0;
        for(Integer i : factors){
            sum += i;
        }

        return sum;
    }
}
