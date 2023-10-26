// https://school.programmers.co.kr/learn/courses/30/lessons/12937
// 짝수와 홀수

package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.EvenOrOdd;

public class EvenOrOddTest {
    // Classify natural number is odd or even.
    @Test
    public void evenOrOdd() {
        EvenOrOdd evenOrNum = new EvenOrOdd();
        Assert.assertEquals(evenOrNum.evenOrOdd(3), "Odd");
    }

    @Test
    public void evenOrOdd1() {
        EvenOrOdd evenOrNum = new EvenOrOdd();
        Assert.assertEquals(evenOrNum.evenOrOdd(4), "Even");
    }
}