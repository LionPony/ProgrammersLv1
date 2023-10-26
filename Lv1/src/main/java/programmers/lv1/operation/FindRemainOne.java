// https://school.programmers.co.kr/learn/courses/30/lessons/87389
// 나머지가 1이 되는 수 찾기

package programmers.lv1.operation;

import programmers.lv1.operation.Factorization;

import java.util.ArrayList;

public class FindRemainOne {
    // Find the smallest natural number that makes divide n remains 1.
    // 3 <= n <= 1,000,000
    public int findRemainOne(int n){
        Factorization factorization = new Factorization();
        ArrayList<Integer> factors = factorization.factorization(n-1);
        return factors.get(1);
    }
}
