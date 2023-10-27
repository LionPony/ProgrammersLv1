// 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.IsInteger;

public class IsIntegerTest {
    // Determine String length is 4 or 6 and only contains num.
    @Test
    public void isInteger() {
        IsInteger isInteger = new IsInteger();
        Assert.assertFalse(isInteger.isInteger("a234"));
    }
    @Test
    public void isInteger1() {
        IsInteger isInteger = new IsInteger();
        Assert.assertTrue(isInteger.isInteger("1234"));
    }
}