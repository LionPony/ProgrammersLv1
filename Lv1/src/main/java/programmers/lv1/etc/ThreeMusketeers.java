// 삼총사
// https://school.programmers.co.kr/learn/courses/30/lessons/131705
package programmers.lv1.etc;

public class ThreeMusketeers {
    // Permutation 3 and if it is 0 count.
    // 3<=number<=13, -1,000<= number.element <= 1,000
    public int threeMusketeers(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number.length; j++){
                for(int k = 0; k < number.length; k++){
                    if(i != j && j != k && i != k){
                        if(number[i] + number[j] + number[k] == 0){
                            count++;
                        }
                    }
                }
            }
        }
        return count/6;
    }
}
