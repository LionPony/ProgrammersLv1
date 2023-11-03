// 달리기 경주
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class RaceTest {
    /**
     * When caster calls name, player overrun the front.
     * After all callings are done, figure out the players ranking list.
     */
    @Test
    public void race() {
        Race race = new Race();
        Assert.assertArrayEquals(new String[]{"mumu", "kai", "mine", "soe", "poe"}, race.race(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"}));
    }
}