// 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;
public class FailRateTest {
/**
 * Find out failure rate of each stages, and rank them.
 **/
    @Test
    public void failRate() {
        FailRate failRate = new FailRate();
        Assert.assertArrayEquals(new int[]{3,4,2,1,5}, failRate.failRate(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }
    @Test
    public void failRate1() {
        FailRate failRate = new FailRate();
        Assert.assertArrayEquals(new int[]{4, 1, 2, 3}, failRate.failRate(4, new int[]{4,4,4,4,4}));
    }

}