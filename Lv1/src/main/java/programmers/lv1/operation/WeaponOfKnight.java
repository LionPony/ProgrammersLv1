// 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
package programmers.lv1.operation;

import java.util.ArrayList;

public class WeaponOfKnight {
    /**
     * Sum natural number under param number count of factors.
     * If count of factors is over limit add power.
     * @param number 1 <= number<= 100,000
     * @param limit 2 <= limit <= 100
     * @param power 1 <= power <= limit
     * @return Sum of factors count.
     */
    public int weaponOfKnight(int number, int limit, int power){
        Factorization factorization = new Factorization();
        ArrayList<Integer> factors = new ArrayList<>();
        int steelWeight = 0;

        for(int i = 1; i <= number; i++){
            factors = factorization.factorization(i);
            if(factors.size() > limit){
                steelWeight += power;
            }
            else{
                steelWeight += factors.size();
            }
        }

        return steelWeight;
    }
}
