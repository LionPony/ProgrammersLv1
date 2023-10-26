// 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
package programmers.lv1.operation;

import programmers.lv1.operation.AddDigits;
import programmers.lv1.operation.Factorization;
import java.util.ArrayList;

public class HarshadNumber {
    // Determine given x is harshad number or not.
    // 1 <= x <= 10,000
    public boolean harshadNumber(int x){
        // Sum digits.
        AddDigits addDigits = new AddDigits();
        int isHarshad = addDigits.addDigits(x);
        // Make factors array. Time complexity is O(log N).
        Factorization factorization = new Factorization();
        ArrayList<Integer> factors = factorization.factorization(x);

        return factors.contains(isHarshad);
    }
}