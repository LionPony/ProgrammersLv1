// 옹알이 (2)
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class Babbling2Test {
/**
 * Find how many words can be pronounced in babbling array.
 * Duplicated babbling is not counted.
 **/
    @Test
    public void babbling2() {
        Babbling2 babbling2 = new Babbling2();
        Assert.assertEquals(1, babbling2.babbling2(new String[]{"aya", "yee", "u", "maa"}));
    }
    @Test
    public void babbling21() {
        Babbling2 babbling2 = new Babbling2();
        Assert.assertEquals(2, babbling2.babbling2(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}