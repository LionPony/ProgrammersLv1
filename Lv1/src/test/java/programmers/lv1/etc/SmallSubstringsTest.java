// 크기가 작은 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class SmallSubstringsTest {
    // When you substring t to length of p, small or same count it.
    // 1<= p.length <= 18, p.length <= t.length <= 10,000
    @Test
    public void smallSubstrings() {
        SmallSubstrings smallSubstrings = new SmallSubstrings();
        Assert.assertEquals(2, smallSubstrings.smallSubstrings("3141592", "271"));
    }
    @Test
    public void smallSubstrings1() {
        SmallSubstrings smallSubstrings = new SmallSubstrings();
        Assert.assertEquals(8, smallSubstrings.smallSubstrings("500220839878", "7"));
    }
    @Test
    public void smallSubstrings2() {
        SmallSubstrings smallSubstrings = new SmallSubstrings();
        Assert.assertEquals(3, smallSubstrings.smallSubstrings("10203", "15"));
    }
}