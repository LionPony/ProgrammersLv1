// 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class MemoryScoreTest {
    /** Each person name has its own score.
     *  Make memory score array by photo.
     *  In photo there can be many people.
     *  name array is person name, and yearning is score of person.
     *  name[i] matches yearning[i]
     **/

    @Test
    public void memoryScore() {
        MemoryScore memoryScore = new MemoryScore();
        Assert.assertArrayEquals(new int[]{19, 15, 6}, memoryScore.memoryScore(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}));
    }
    @Test
    public void memoryScore1() {
        MemoryScore memoryScore = new MemoryScore();
        Assert.assertArrayEquals(new int[]{67, 0, 55}, memoryScore.memoryScore(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"},{"pony", "tom", "teddy"}, {"con", "mona", "don"}}));
    }
    @Test
    public void memoryScore2() {
        MemoryScore memoryScore = new MemoryScore();
        Assert.assertArrayEquals(new int[]{5, 15, 0}, memoryScore.memoryScore(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"},{"kein", "deny", "may"}, {"kon", "coni"}}));
    }
}