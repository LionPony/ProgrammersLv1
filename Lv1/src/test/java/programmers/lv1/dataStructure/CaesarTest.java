// 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {
    // Make Caesar cipher.
    @Test
    public void caesar() {
        Caesar caesar = new Caesar();
        Assert.assertEquals("BC", caesar.caesar("AB", 1));
    }
    @Test
    public void caesar1() {
        Caesar caesar = new Caesar();
        Assert.assertEquals("a", caesar.caesar("z", 1));
    }
    @Test
    public void caesar2() {
        Caesar caesar = new Caesar();
        Assert.assertEquals("e F d", caesar.caesar("a B z", 4));
    }
}