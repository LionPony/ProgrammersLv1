// 최대공약수와 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class GCDLCMTest {
    //Get GCD and LCM in shape of array.
    // 1 <= n, m <= 1,000,000
    @Test
    public void GCDLCM() {
        GCDLCM gcdlcm = new GCDLCM();
        Assert.assertArrayEquals(new int[]{3, 12}, gcdlcm.gCDLCM(3, 12));
    }
    @Test
    public void GCDLCM1() {
        GCDLCM gcdlcm = new GCDLCM();
        Assert.assertArrayEquals(new int[]{1, 10}, gcdlcm.gCDLCM(2, 5));
    }
    // Get Greatest common divisor.
    @Test
    public void getGCD() {
        GCDLCM gcdlcm = new GCDLCM();
        Assert.assertEquals(6, gcdlcm.getGCD(12, 18));
    }
    // Get Least common multiple.
    @Test
    public void getLCM() {
        GCDLCM gcdlcm = new GCDLCM();
        Assert.assertEquals(36, gcdlcm.getLCM(12, 18));
    }
}