// 신규 아이디 추천
// https://school.programmers.co.kr/learn/courses/30/lessons/72410
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class RecommendNewIdTest {
/**
 * Make String pass the set rules.
**/
    @Test
    public void recommendNewId() {
        RecommendNewId recommendNewId = new RecommendNewId();
        Assert.assertEquals("bat.y.abcdefghi", recommendNewId.recommendNewId("...!@BaT#*..y.abcdefghijklm"));
    }
    @Test
    public void recommendNewId1() {
        RecommendNewId recommendNewId = new RecommendNewId();
        Assert.assertEquals("z--", recommendNewId.recommendNewId("z-+.^."));
    }
    @Test
    public void recommendNewId2() {
        RecommendNewId recommendNewId = new RecommendNewId();
        Assert.assertEquals("aaa", recommendNewId.recommendNewId("=.="));
    }
    @Test
    public void recommendNewId3() {
        RecommendNewId recommendNewId = new RecommendNewId();
        Assert.assertEquals("123_.def", recommendNewId.recommendNewId("123_.def"));
    }
    @Test
    public void recommendNewId4() {
        RecommendNewId recommendNewId = new RecommendNewId();
        Assert.assertEquals("abcdefghijklmn", recommendNewId.recommendNewId("abcdefghijklmn.p"));
    }
}