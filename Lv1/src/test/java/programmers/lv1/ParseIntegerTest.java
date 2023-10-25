// 문자열을 정수로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/12925
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class ParseIntegerTest {
    // String to int.
    @Test
    public void parseInteger() {
        ParseInteger parseInteger = new ParseInteger();
        Assert.assertEquals(1234, parseInteger.parseIntger("1234"));
    }
}