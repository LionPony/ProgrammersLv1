// 평균 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class AverageTest {
    // Figure out average of integer array.
    @Test
    public void average() {
        Average average = new Average();
        Assert.assertEquals(2.5, average.average(new int[]{1, 2, 3, 4}), 0.1);
    }
}