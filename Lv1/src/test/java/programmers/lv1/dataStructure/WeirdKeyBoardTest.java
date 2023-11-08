// 대충 만든 자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class WeirdKeyBoardTest {
    /**
     * Each key has various variables.
     * Find out the minimal touch to make targets.
     */
    @Test
    public void weirdKeyBoard() {
        WeirdKeyBoard weirdKeyBoard = new WeirdKeyBoard();
        Assert.assertArrayEquals(new int[]{9, 4}, weirdKeyBoard.weirdKeyBoard(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}));
    }
    @Test
    public void weirdKeyBoard1() {
        WeirdKeyBoard weirdKeyBoard = new WeirdKeyBoard();
        Assert.assertArrayEquals(new int[]{-1}, weirdKeyBoard.weirdKeyBoard(new String[]{"AA"}, new String[]{"B"}));
    }
    @Test
    public void weirdKeyBoard2() {
        WeirdKeyBoard weirdKeyBoard = new WeirdKeyBoard();
        Assert.assertArrayEquals(new int[]{4, 6}, weirdKeyBoard.weirdKeyBoard(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"}));
    }
}