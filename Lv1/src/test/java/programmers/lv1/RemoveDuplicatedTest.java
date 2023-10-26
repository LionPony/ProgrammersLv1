// 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatedTest {
    // Leave only one in continuous numbers.
    // array.length(natural number) <= 1,000,000, 0 <= array.elements <= 9
    @Test
    public void removeDuplicated() {
        RemoveDuplicated removeDuplicated = new RemoveDuplicated();
        Assert.assertArrayEquals(new int[]{1, 3, 0, 1}, removeDuplicated.removeDuplicated(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }
    @Test
    public void removeDuplicated1() {
        RemoveDuplicated removeDuplicated = new RemoveDuplicated();
        Assert.assertArrayEquals(new int[]{4, 3}, removeDuplicated.removeDuplicated(new int[]{4, 4, 4, 3, 3}));
    }
}