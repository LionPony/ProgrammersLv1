// 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.CollatzConjecture;

public class CollatzConjectureTest {
    /** Collatz Conjecture
     If given number is even divide 2.
     If given number is odd multiply 3 and add 1.
     Do same job until given becomes 1.
     Return how many times operation happened.
     1 <= num < 8,000,000
     **/
    @Test
    public void collatzConjecture() {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        Assert.assertEquals(8, collatzConjecture.collatzConjecture(6));
    }
    @Test
    public void collatzConjecture1() {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        Assert.assertEquals(4, collatzConjecture.collatzConjecture(16));
    }
    @Test
    public void collatzConjecture2() {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        Assert.assertEquals(-1, collatzConjecture.collatzConjecture(626331));
    }
}