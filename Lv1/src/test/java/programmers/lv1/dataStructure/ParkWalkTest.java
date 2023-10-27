// 공원 산책
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class ParkWalkTest {

    @Test
    public void parkWalk() {
        ParkWalk parkWalk = new ParkWalk();
        Assert.assertArrayEquals(new int[]{2, 1}, parkWalk.parkWalk(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"}));
    }
    @Test
    public void parkWalk1() {
        ParkWalk parkWalk = new ParkWalk();
        Assert.assertArrayEquals(new int[]{0, 1}, parkWalk.parkWalk(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"}));
    }
    @Test
    public void parkWalk2() {
        ParkWalk parkWalk = new ParkWalk();
        Assert.assertArrayEquals(new int[]{0, 0}, parkWalk.parkWalk(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"}));
    }
}