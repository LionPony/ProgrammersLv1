// 나머지 1이 되는 수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/87389

package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.FindRemainOne;

public class FindRemainOneTest {
    // Find the smallest natural number that makes divide n remains 1.
    // 3 <= n <= 1,000,000
    @Test
    public void findRemainOne() {
        FindRemainOne findRemainOne = new FindRemainOne();
        Assert.assertEquals(findRemainOne.findRemainOne(10), 3);
    }
    @Test
    public void findRemainOne1() {
        FindRemainOne findRemainOne = new FindRemainOne();
        Assert.assertEquals(findRemainOne.findRemainOne(12), 11);
    }
}