// 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class WatermelonTest {
    // Make patterned string. n(natural number) <= 10,000
    // Example : n = 3 수박수, n = 4 수박수박
    @Test
    public void watermelon() {
        Watermelon watermelon = new Watermelon();
        Assert.assertEquals("수박수", watermelon.watermelon(3));
    }
    @Test
    public void watermelon1() {
        Watermelon watermelon = new Watermelon();
        Assert.assertEquals("수박수박", watermelon.watermelon(4));
    }
    @Test
    public void watermelon2() {
        Watermelon watermelon = new Watermelon();
        Assert.assertEquals("수", watermelon.watermelon(1));
    }
    @Test
    public void watermelon3() {
        Watermelon watermelon = new Watermelon();
        Assert.assertEquals("수박", watermelon.watermelon(2));
    }
}