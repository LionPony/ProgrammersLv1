// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.dataStructure.DescendString;

public class DescendStringTest {
    // Order String in descending order.
    @Test
    public void descendString() {
        DescendString descendString = new DescendString();
        Assert.assertEquals("gfedcbZ", descendString.descendString("Zbcdefg"));
    }
}