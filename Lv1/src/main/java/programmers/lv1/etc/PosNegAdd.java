// 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
package programmers.lv1.etc;

public class PosNegAdd {
    // 2 arrays are given. one is absolute, one is boolean.
    // false means negative, true means positive sign. Index goes together.
    // Add all numbers in array and return it.
    // 1 <= absolutes.elements <= 1000
    // 1 <= absolutes.length <= 1000
    public int posNegAdd(int[] absolutes, boolean[] signs){
        int sum = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                sum += absolutes[i];
            }
            else {
                sum -= absolutes[i];
            }
        }
        return sum;
    }
}
