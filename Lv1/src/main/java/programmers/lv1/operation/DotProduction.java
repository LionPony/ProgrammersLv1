// 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
package programmers.lv1.operation;

public class DotProduction {
    // Calculate dot production
    public int dotProduction(int[] a, int[] b){
        int sum = 0;
        for(int i = 0; i< a.length; i++){
            sum += a[i]*b[i];
        }
        return sum;
    }
}
