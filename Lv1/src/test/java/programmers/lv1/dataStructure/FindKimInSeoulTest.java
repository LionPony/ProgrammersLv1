// 서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.dataStructure.FindKimInSeoul;

public class FindKimInSeoulTest {
    // In String array seoul, find Kim index and return "김서방은 index에 있다"
    // 1 <= seoul.length <= 1000
    // Elements length in seoul are more than 1, under 20.
    // "Kim" is must in seoul.
    @Test
    public void findKimInSeoul() {
        FindKimInSeoul findKimInSeoul = new FindKimInSeoul();
        Assert.assertEquals("김서방은 1에 있다", findKimInSeoul.findKimInSeoul(new String[]{"Jane", "Kim"}));
    }
}