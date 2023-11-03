// 소수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class MakingPrimeNumberTest {
    /**
     * Make number which is sum of three elements in nums.
     * If number is prime count it.
     */
    @Test
    public void makingPrimeNumber() {
        MakingPrimeNumber makingPrimeNumber = new MakingPrimeNumber();
        Assert.assertEquals(1, makingPrimeNumber.makingPrimeNumber(new int[]{1, 2, 3, 4}));
    }
    @Test
    public void makingPrimeNumber1() {
        MakingPrimeNumber makingPrimeNumber = new MakingPrimeNumber();
        Assert.assertEquals(4, makingPrimeNumber.makingPrimeNumber(new int[]{1, 2, 7, 6, 4}));
    }
    @Test
    public void makingPrimeNumber2() {
        MakingPrimeNumber makingPrimeNumber = new MakingPrimeNumber();
        Assert.assertEquals(0, makingPrimeNumber.makingPrimeNumber(new int[]{1, 2, 3}));
    }
}