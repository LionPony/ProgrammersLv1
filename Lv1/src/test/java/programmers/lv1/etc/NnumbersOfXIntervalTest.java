// X만큼 간격이 있는 N개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.NnumbersOfXInterval;

public class NnumbersOfXIntervalTest {
    // Make array which starts at x and increases x n times.
    // -10000000 <= x <= 10000000, n is natural number under 1000
    @Test
    public void nNumbersOfXInterval() {
        NnumbersOfXInterval nnumbersOfXInterval = new NnumbersOfXInterval();
        Assert.assertArrayEquals(new long[]{2, 4, 6, 8, 10}, nnumbersOfXInterval.nNumbersOfXInterval(2, 5));
    }
}