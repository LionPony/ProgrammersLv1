// 두 개 뽑아서 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class Pick2SumTest {
    // Pick different 2 in array and add it.
    // Make every cases of array and sort it in ascending array.
    @Test
    public void pick2Sum() {
        Pick2Sum pick2Sum = new Pick2Sum();
        Assert.assertArrayEquals(new int[]{2,3,4,5,6,7}, pick2Sum.pick2Sum(new int[]{2,1,3,4,1}));
    }
    @Test
    public void pick2Sum1() {
        Pick2Sum pick2Sum = new Pick2Sum();
        Assert.assertArrayEquals(new int[]{2,5,7,9,12}, pick2Sum.pick2Sum(new int[]{5,0,2,7}));
    }
}