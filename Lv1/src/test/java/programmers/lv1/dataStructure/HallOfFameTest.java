// 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class HallOfFameTest {
    // Return each time when new score comes, array of the smallest score in k numbers of ranking.
    @Test
    public void hallOfFame() {
        HallOfFame hallOfFame = new HallOfFame();
        Assert.assertArrayEquals(new int[]{10, 10, 10, 20, 20, 100, 100}, hallOfFame.hallOfFame(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
    }
    @Test
    public void hallOfFame1() {
        HallOfFame hallOfFame = new HallOfFame();
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300}, hallOfFame.hallOfFame(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }
}