// 약수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12928
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDivisorTest {
    // Sum of divisors.
    // 0 <= n <= 3000
    @Test
    public void sumofDivisor1() {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        Assert.assertEquals(28, sumOfDivisor.sumofDivisor(12));
    }
    @Test
    public void sumofDivisor2() {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        Assert.assertEquals(6, sumOfDivisor.sumofDivisor(5));
    }
    @Test
    public void sumofDivisor3() {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        Assert.assertEquals(0, sumOfDivisor.sumofDivisor(0));
    }
    @Test
    public void sumofDivisor4() {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        Assert.assertEquals(7, sumOfDivisor.sumofDivisor(4));
    }
    @Test
    public void sumofDivisor5() {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        Assert.assertEquals(1, sumOfDivisor.sumofDivisor(1));
    }
    @Test
    public void sumofDivisor6() {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        Assert.assertEquals(3, sumOfDivisor.sumofDivisor(2));
    }
}