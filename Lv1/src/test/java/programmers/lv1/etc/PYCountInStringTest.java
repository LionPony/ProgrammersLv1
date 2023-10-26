// 문자열 내 p와 y의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.PYCountInString;

public class PYCountInStringTest {
    // Count p and y in String. Ignore Upper or lower.
    // if p, y counts are same return true.
    @Test
    public void pyCountInString() {
        PYCountInString pyCountInString = new PYCountInString();
        Assert.assertTrue(pyCountInString.pyCountInString("pPoooyY"));
    }
    @Test
    public void pyCountInString1() {
        PYCountInString pyCountInString = new PYCountInString();
        Assert.assertFalse(pyCountInString.pyCountInString("Pyy"));
    }
}