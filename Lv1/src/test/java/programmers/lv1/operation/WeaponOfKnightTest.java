// 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class WeaponOfKnightTest {
    /**
     * Sum natural number under param number count of factors.
     * If count of factors is over limit add power.
     */
    @Test
    public void weaponOfKnight() {
        WeaponOfKnight weaponOfKnight = new WeaponOfKnight();
        Assert.assertEquals(10, weaponOfKnight.weaponOfKnight(5, 3, 2));
    }
    @Test
    public void weaponOfKnight1() {
        WeaponOfKnight weaponOfKnight = new WeaponOfKnight();
        Assert.assertEquals(21, weaponOfKnight.weaponOfKnight(10, 3, 2));
    }
}