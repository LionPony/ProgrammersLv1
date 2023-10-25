// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class AddMissingTest {
    // 0~9 which not included in numbers array, return sum of them.
    @Test
    public void addMissing() {
        AddMissing addMissing = new AddMissing();
        Assert.assertEquals(14, addMissing.addMissing(new int[]{1,2,3,4,6,7,8,0}));
    }
    @Test
    public void addMissing1() {
        AddMissing addMissing = new AddMissing();
        Assert.assertEquals(6, addMissing.addMissing(new int[]{5,8,4,0,6,7,9}));
    }
}