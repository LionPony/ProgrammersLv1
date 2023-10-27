// 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.HarshadNumber;

public class HarshadNumberTest {
    // Determine given x is harshad number or not.
    // 1 <= x <= 10,000
    @Test
    public void harshadNumber() {
        HarshadNumber harshadNumber = new HarshadNumber();
        Assert.assertTrue(harshadNumber.harshadNumber(10));
    }
    @Test
    public void harshadNumber1() {
        HarshadNumber harshadNumber = new HarshadNumber();
        Assert.assertTrue(harshadNumber.harshadNumber(12));
    }
    @Test
    public void harshadNumber2() {
        HarshadNumber harshadNumber = new HarshadNumber();
        Assert.assertFalse(harshadNumber.harshadNumber(11));
    }
    @Test
    public void harshadNumber3() {
        HarshadNumber harshadNumber = new HarshadNumber();
        Assert.assertFalse(harshadNumber.harshadNumber(13));
    }
}