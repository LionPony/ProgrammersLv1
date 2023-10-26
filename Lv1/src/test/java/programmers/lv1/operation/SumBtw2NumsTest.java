// 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.SumBtw2Nums;

public class SumBtw2NumsTest {
    // Sum between two integers.
    @Test
    public void sumBtw2Nums() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(12, sumBtw2Nums.sumBtw2Nums(3, 5));
    }
    @Test
    public void sumBtw2Nums1() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(3, sumBtw2Nums.sumBtw2Nums(3, 3));
    }
    @Test
    public void sumBtw2Nums2() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(12, sumBtw2Nums.sumBtw2Nums(5, 3));
    }

    //Return smaller one.
    @Test
    public void compareSmall() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(1, sumBtw2Nums.compareSmall(1, 3));
    }
    @Test
    public void compareSmall1() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(-1, sumBtw2Nums.compareSmall(-1, 3));
    }
    @Test
    public void compareSmall2() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(-3, sumBtw2Nums.compareSmall(1, -3));
    }
    @Test
    public void compareSmall3() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(-3, sumBtw2Nums.compareSmall(-1, -3));
    }

    //Return bigger one.
    @Test
    public void compareBig() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(3, sumBtw2Nums.compareBig(1, 3));
    }
    @Test
    public void compareBig1() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(3, sumBtw2Nums.compareBig(-1, 3));
    }
    @Test
    public void compareBig2() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(1, sumBtw2Nums.compareBig(1, -3));
    }
    @Test
    public void compareBig3() {
        SumBtw2Nums sumBtw2Nums = new SumBtw2Nums();
        Assert.assertEquals(-1, sumBtw2Nums.compareBig(-1, -3));
    }
}