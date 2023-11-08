// 크레인 인형뽑기 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class CraneClawTest {
    /**
     * Doll claw machine game.
     * You pick one in board and take it to basckt.
     * Same dolls meet in bascket it broke down and score goes up.
     */
    @Test
    public void craneClaw() {
        CraneClaw craneClaw = new CraneClaw();
        Assert.assertEquals(4, craneClaw.craneClaw(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }
}