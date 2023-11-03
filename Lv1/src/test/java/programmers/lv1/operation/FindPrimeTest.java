// 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12921
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class FindPrimeTest {
    /**
     * Count prime number under n
     */
    @Test
    public void findPrime() {
        FindPrime findPrime = new FindPrime();
        Assert.assertEquals(4, findPrime.findPrime(10));
    }
    @Test
    public void findPrime1() {
        FindPrime findPrime = new FindPrime();
        Assert.assertEquals(3, findPrime.findPrime(5));
    }
}