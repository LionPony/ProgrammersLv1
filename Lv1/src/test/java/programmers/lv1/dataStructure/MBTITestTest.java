package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class MBTITestTest {
/**
 * Organize survey and find out result.
 * Survey has 4 groups of charater type.
 * The charater with the maximum score in indicators make mbti.
 **/
    @Test
    public void mbtiTest() {
        MBTITest mbtiTest = new MBTITest();
        Assert.assertEquals("TCMA", mbtiTest.mbtiTest(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
    }
    @Test
    public void mbtiTest1() {
        MBTITest mbtiTest = new MBTITest();
        Assert.assertEquals("RCJA", mbtiTest.mbtiTest(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }
    @Test
    public void mbtiTest2() {
        MBTITest mbtiTest = new MBTITest();
        Assert.assertEquals("RCJN", mbtiTest.mbtiTest(new String[]{"AN"}, new int[]{7}));
    }
    @Test
    public void mbtiTest3() {
        MBTITest mbtiTest = new MBTITest();
        Assert.assertEquals("TCJA", mbtiTest.mbtiTest(new String[]{"RT", "RT", "RT"}, new int[]{7, 5, 2}));
    }
    @Test
    public void mbtiTest4() {
        MBTITest mbtiTest = new MBTITest();
        Assert.assertEquals("TCJA", mbtiTest.mbtiTest(new String[]{"RT", "RT", "RT"}, new int[]{7, 2, 4}));
    }
    @Test
    public void mbtiTest5() {
        MBTITest mbtiTest = new MBTITest();
        Assert.assertEquals("TCJA", mbtiTest.mbtiTest(new String[]{"RT", "RT", "RT"}, new int[]{7, 5, 2}));
    }
}