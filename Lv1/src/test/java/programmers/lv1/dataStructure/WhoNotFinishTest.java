// 완주하지 못한 선수
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class WhoNotFinishTest {
    /**
     * Find out who could not finish the race.
     */
    @Test
    public void whoNotFinish() {
        WhoNotFinish whoNotFinish =  new WhoNotFinish();
        Assert.assertEquals("leo", whoNotFinish.whoNotFinish(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
    @Test
    public void whoNotFinish1() {
        WhoNotFinish whoNotFinish =  new WhoNotFinish();
        Assert.assertEquals("vinko", whoNotFinish.whoNotFinish(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
    }
    @Test
    public void whoNotFinish2() {
        WhoNotFinish whoNotFinish =  new WhoNotFinish();
        Assert.assertEquals("mislav", whoNotFinish.whoNotFinish(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    @Test
    public void whoNotFinishHash() {
        WhoNotFinish whoNotFinish =  new WhoNotFinish();
        Assert.assertEquals("leo", whoNotFinish.whoNotFinishHash(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
    @Test
    public void whoNotFinishHash1() {
        WhoNotFinish whoNotFinish =  new WhoNotFinish();
        Assert.assertEquals("vinko", whoNotFinish.whoNotFinishHash(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
    }
    @Test
    public void whoNotFinishHash2() {
        WhoNotFinish whoNotFinish =  new WhoNotFinish();
        Assert.assertEquals("mislav", whoNotFinish.whoNotFinishHash(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}