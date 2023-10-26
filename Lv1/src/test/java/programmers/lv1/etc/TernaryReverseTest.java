// 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.TernaryReverse;

public class TernaryReverseTest {
    // Turn n into ternary. And reverse it and return in decimal.
    // 1 <= n(natural number) <= 100,000,000
    @Test
    public void ternaryReverse() {
        TernaryReverse ternaryReverse = new TernaryReverse();
        Assert.assertEquals(7, ternaryReverse.ternaryReverse(45));
    }
    @Test
    public void ternaryReverse1() {
        TernaryReverse ternaryReverse = new TernaryReverse();
        Assert.assertEquals(229, ternaryReverse.ternaryReverse(125));
    }
}