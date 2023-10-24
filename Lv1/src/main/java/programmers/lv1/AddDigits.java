// https://school.programmers.co.kr/learn/courses/30/lessons/12931
// 자릿수 더하기

package programmers.lv1;

public class AddDigits {
    // Add every digit in natural number.
    // Recursive used.
    public int addDigits(int n){
        if(n > 0){
            return n%10 + addDigits(n/10);
        }
        return 0;
    }
}