// 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.WeirdString;

public class WeirdStringTest {
    // Make string char at odd be lower case, even be upper case.
    @Test
    public void weirdString() {
        WeirdString weirdString = new WeirdString();
        Assert.assertEquals("TrY HeLlO WoRlD", weirdString.weirdString("try hello world"));
    }
    @Test
    public void weirdString1() {
        WeirdString weirdString = new WeirdString();
        Assert.assertEquals("AaA ", weirdString.weirdString("aaa "));
    }
}