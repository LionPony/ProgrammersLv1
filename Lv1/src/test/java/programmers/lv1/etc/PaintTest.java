// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class PaintTest {
    /**
     * Find the minimal brush to paint fence.
     * 1<= m <= n <= 100,000
     * 1 <= section.length <= n
     */
    @Test
    public void paint() {
        Paint paint = new Paint();
        Assert.assertEquals(2, paint.paint(8, 4, new int[]{2, 3, 6}));
    }
    @Test
    public void paint1() {
        Paint paint = new Paint();
        Assert.assertEquals(1, paint.paint(5, 4, new int[]{1, 3}));
    }
    @Test
    public void paint2() {
        Paint paint = new Paint();
        Assert.assertEquals(4, paint.paint(4, 1, new int[]{1, 2, 3, 4}));
    }
}