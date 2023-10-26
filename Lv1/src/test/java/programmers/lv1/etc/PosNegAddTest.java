// 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.PosNegAdd;

public class PosNegAddTest {
    // 2 arrays are given. one is absolute, one is boolean.
    // false means negative, true means positive sign. Index goes together.
    // Add all numbers in array and return it.
    // 1 <= absolutes.elements <= 1000
    // 1 <= absolutes.length <= 1000
    @Test
    public void posNegAdd() {
        PosNegAdd posNegAdd = new PosNegAdd();
        Assert.assertEquals(9, posNegAdd.posNegAdd(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }
    @Test
    public void posNegAdd1() {
        PosNegAdd posNegAdd = new PosNegAdd();
        Assert.assertEquals(0, posNegAdd.posNegAdd(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }
}