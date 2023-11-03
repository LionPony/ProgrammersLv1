// 푸드 파이트 대회
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class FoodFightTest {

    @Test
    public void foodFight() {
        FoodFight foodFight = new FoodFight();
        Assert.assertEquals("1223330333221", foodFight.foodFight(new int[]{1, 3, 4, 6}));
    }
    @Test
    public void foodFight1() {
        FoodFight foodFight = new FoodFight();
        Assert.assertEquals("111303111", foodFight.foodFight(new int[]{1, 7, 1, 2}));
    }
}