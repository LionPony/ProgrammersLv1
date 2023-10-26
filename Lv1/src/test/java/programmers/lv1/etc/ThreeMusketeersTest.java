// 삼총사
// https://school.programmers.co.kr/learn/courses/30/lessons/131705
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class ThreeMusketeersTest {
    // Permutation 3 and if it is 0 count.
    // 3<=number<=13, -1,000<= number.element <= 1,000
    @Test
    public void threeMusketeers() {
        ThreeMusketeers threeMusketeers = new ThreeMusketeers();
        Assert.assertEquals(2, threeMusketeers.threeMusketeers(new int[]{-2, 3, 0, 2, -5}));
    }
    @Test
    public void threeMusketeers1() {
        ThreeMusketeers threeMusketeers = new ThreeMusketeers();
        Assert.assertEquals(5, threeMusketeers.threeMusketeers(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }
    @Test
    public void threeMusketeers2() {
        ThreeMusketeers threeMusketeers = new ThreeMusketeers();
        Assert.assertEquals(0, threeMusketeers.threeMusketeers(new int[]{-1, 1, -1, 1}));
    }
}