// 정수 제곱근 판별
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class DetermineIntegerSQRTTest {
    // Determine square root of number is integer.
    // If n is square of integer return x+1 square. If not return -1.
    // 1 <= n <= 50,000,000,000,000
    @Test
    public void determineIntegerSQRT() {
        DetermineIntegerSQRT determineIntegerSQRT = new DetermineIntegerSQRT();
        Assert.assertEquals(144, determineIntegerSQRT.determineIntegerSQRT(121));
    }
    @Test
    public void determineIntegerSQRT1() {
        DetermineIntegerSQRT determineIntegerSQRT = new DetermineIntegerSQRT();
        Assert.assertEquals(-1, determineIntegerSQRT.determineIntegerSQRT(3));
    }
}