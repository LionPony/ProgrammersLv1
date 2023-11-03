// K번째 수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class KthNumberTest {
    // Select ith number to jth number, sort it and return kth number.
    // 1<= array.length <= 100, 1<= array.element <= 100
    // 1<= commands.length <= 50, 3 <= commands.element

    @Test
    public void kthNumber() {
        KthNumber kthNumber = new KthNumber();
        Assert.assertArrayEquals(new int[]{5, 6, 3}, kthNumber.kthNumber(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}