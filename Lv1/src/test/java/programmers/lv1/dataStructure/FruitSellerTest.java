// 과일 장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class FruitSellerTest {
    /*  k is the most expensive one in score.
     *  m is number to group.
     *  The cheapest one * m is price of group.
     *  Find out the way how to make most expensive groups.
     */
    @Test
    public void fruitSeller() {
        FruitSeller fruitSeller = new FruitSeller();
        Assert.assertEquals(8, fruitSeller.fruitSeller(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }
    @Test
    public void fruitSeller1() {
        FruitSeller fruitSeller = new FruitSeller();
        Assert.assertEquals(33, fruitSeller.fruitSeller(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}