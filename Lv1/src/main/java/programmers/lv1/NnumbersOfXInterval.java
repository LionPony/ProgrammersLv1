// X만큼 간격이 있는 N개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
package programmers.lv1;

public class NnumbersOfXInterval {
    // Make array which starts at x and increases x n times.
    // -10000000 <= x <= 10000000, n is natural number under 1000
    public long[] nNumbersOfXInterval(int x, int n){
        long[] result = new long[n];
        long xClone = x;
        for(int i = 0; i < n; i++){
            result[i] = xClone;
            xClone += x;
        }
        return result;
    }
}
