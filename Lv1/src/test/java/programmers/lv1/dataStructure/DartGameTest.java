// [1차] 다트 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17682
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class DartGameTest {
/**
 * Calculate String dartResult.
 **/
    @Test
    public void dartGame() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(37, dartGame.dartGame("1S2D*3T"));
    }
    @Test
    public void dartGame1() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(9, dartGame.dartGame("1D2S#10S"));
    }
    @Test
    public void dartGame2() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(3, dartGame.dartGame("1D2S0T"));
    }
    @Test
    public void dartGame3() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(23, dartGame.dartGame("1S*2T*3S"));
    }
    @Test
    public void dartGame4() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(5, dartGame.dartGame("1D#2S*3S"));
    }
    @Test
    public void dartGame5() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(-4, dartGame.dartGame("1T2D3D#"));
    }
    @Test
    public void dartGame6() {
        DartGame dartGame = new DartGame();
        Assert.assertEquals(59, dartGame.dartGame("1D2S3T*"));
    }
}