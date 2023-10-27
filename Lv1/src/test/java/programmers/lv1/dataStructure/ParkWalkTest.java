// 공원 산책
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class ParkWalkTest {
    /** Find last position.
     * Park is 2D array of parkMap. S is start, O is accessible, X is not accessible.
     * 3<= park.lenght, park[i].length <= 50
     * Routes are ways you move.
     * 1 <= routes.length <= 50
     * If x is in the way or out of park map. Ignore that route.
     **/
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