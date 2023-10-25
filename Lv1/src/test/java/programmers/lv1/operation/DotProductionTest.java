// 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class DotProductionTest {
    // Calculate dot production
    @Test
    public void dotProduction() {
        DotProduction dotProduction = new DotProduction();
        Assert.assertEquals(3, dotProduction.dotProduction(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
    }
    @Test
    public void dotProduction1() {
        DotProduction dotProduction = new DotProduction();
        Assert.assertEquals(-2, dotProduction.dotProduction(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}