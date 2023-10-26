package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class LeastSquareTest {
    // Making a square that every size fits.
    // 1<= sizes.length <= 10,000
    @Test
    public void leastSquare() {
        LeastSquare leastSquare = new LeastSquare();
        Assert.assertEquals(4000, leastSquare.leastSquare(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
    @Test
    public void leastSquare1() {
        LeastSquare leastSquare = new LeastSquare();
        Assert.assertEquals(120, leastSquare.leastSquare(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
    }
    @Test
    public void leastSquare2() {
        LeastSquare leastSquare = new LeastSquare();
        Assert.assertEquals(133, leastSquare.leastSquare(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
    @Test
    public void findSmall(){
        LeastSquare leastSquare = new LeastSquare();
        Assert.assertEquals(50, leastSquare.findSmall(new int[]{60, 50}));
    }
    @Test
    public void findBig(){
        LeastSquare leastSquare = new LeastSquare();
        Assert.assertEquals(60, leastSquare.findBig(new int[]{60, 50}));
    }
}