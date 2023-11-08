// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class GymSuitTest {
    /**
     * Some of the students lost there gymsuit.
     * Some others have reseve so they can hand over them.
     * But gymsuit has size they can only lend front and back.
     * Figure out the most count of get gymsuit.
     */
    @Test
    public void gymSuit() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(5, gymSuit.gymSuit(5,  new int[]{2, 4}, new int[]{1, 3, 5}));
    }
    @Test
    public void gymSuit1() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(2, gymSuit.gymSuit(3,  new int[]{3}, new int[]{1}));
    }
    @Test
    public void gymSuit2() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(4, gymSuit.gymSuit(5,  new int[]{2, 4}, new int[]{3}));
    }
    @Test
    public void gymSuit3() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(4, gymSuit.gymSuit(5,  new int[]{2, 5}, new int[]{1, 3}));
    }
    @Test
    public void gymSuit4() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(4, gymSuit.gymSuit(5,  new int[]{4, 5}, new int[]{3, 4}));
    }
    @Test
    public void gymSuit5() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(4, gymSuit.gymSuit(4,  new int[]{2}, new int[]{1, 2}));
    }
    @Test
    public void gymSuit6() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(4, gymSuit.gymSuit(5,  new int[]{1, 3}, new int[]{2, 5}));
    }
    @Test
    public void gymSuit7() {
        GymSuit gymSuit = new GymSuit();
        Assert.assertEquals(5, gymSuit.gymSuit(5,  new int[]{4, 2}, new int[]{3 ,5}));
    }
}