// 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;


public class DivideStringTest {
    /**
     * Read first letter and count same letter and other letter.
     * If same letter and other letter count meets cut String and repeat it.
     * Figure out how many part will be made.
     */

    @Test
    public void divideString() {
        DivideString divideString = new DivideString();
        Assert.assertEquals(3, divideString.divideString("banana"));
    }
    @Test
    public void divideString1() {
        DivideString divideString = new DivideString();
        Assert.assertEquals(6, divideString.divideString("abracadabra"));
    }
    @Test
    public void divideString2() {
        DivideString divideString = new DivideString();
        Assert.assertEquals(3, divideString.divideString("aaabbaccccabba"));
    }
}