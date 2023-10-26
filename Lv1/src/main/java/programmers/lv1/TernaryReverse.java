// 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
package programmers.lv1;

public class TernaryReverse {
    // Turn n into ternary. And reverse it and return in decimal.
    // 1 <= n(natural number) <= 100,000,000
    public int ternaryReverse(int n){
        String ternary = Integer.toString(n, 3);
        String[] array = ternary.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = array.length-1; i >= 0; i--){
            sb.append(array[i]);
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
