// 콜라 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class ColaProblemTest {
    /** If you give cola glasses you can get complimentary cola.
     * Figure out how many colas you would get.
     * n = Cola glasses at start
     * a = need for complimentary
     * b = colas given for complimentarty
     **/
    @Test
    public void colaProblem() {
        ColaProblem colaProblem = new ColaProblem();
        Assert.assertEquals(19, colaProblem.colaProblem(2, 1, 20));
    }
    @Test
    public void colaProblem1() {
        ColaProblem colaProblem = new ColaProblem();
        Assert.assertEquals(9, colaProblem.colaProblem(3, 1, 20));
    }
    @Test
    public void colaProblem2() {
        ColaProblem colaProblem = new ColaProblem();
        Assert.assertEquals(36, colaProblem.colaProblem(3, 2, 20));
    }
}