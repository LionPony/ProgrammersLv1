// 정수 제곱근 판별
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
package programmers.lv1.operation;

public class DetermineIntegerSQRT {
    // Determine square root of number is integer.
    // If n is square of integer return x+1 square. If not return -1.
    // 1 <= n <= 50,000,000,000,000
    public long determineIntegerSQRT(long n){
        if(n == Math.pow((int)Math.sqrt(n), 2)){
            return (long) Math.pow((int)Math.sqrt(n)+1, 2);
        }
        return -1;
    }
}
