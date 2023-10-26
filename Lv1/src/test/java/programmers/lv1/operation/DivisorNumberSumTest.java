// 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.DivisorNumberSum;

public class DivisorNumberSumTest {
    // Between left to right, if number’s divisor is even add. odd sub.
    // 1<= left <= right <= 1,000.
    @Test
    public void divisorNumberSum() {
        DivisorNumberSum divisorNumberSum = new DivisorNumberSum();
        Assert.assertEquals(43, divisorNumberSum.divisorNumberSum(13, 17));
    }
    @Test
    public void divisorNumberSum1() {
        DivisorNumberSum divisorNumberSum = new DivisorNumberSum();
        Assert.assertEquals(52, divisorNumberSum.divisorNumberSum(24, 27));
    }
}