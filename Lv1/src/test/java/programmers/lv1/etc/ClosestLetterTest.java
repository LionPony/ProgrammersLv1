// 가장 가까운 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class ClosestLetterTest {
    /*  Given string s, each letter in s wants to mark closest same letter
     *  which appears before it comes.
     *  mark is distance between same letter.
     */
    @Test
    public void closestLetter() {
        ClosestLetter closestLetter = new ClosestLetter();
        Assert.assertArrayEquals(new int[]{-1, -1, -1, 2, 2, 2}, closestLetter.closestLetter("banana"));
    }
    @Test
    public void closestLetter1() {
        ClosestLetter closestLetter = new ClosestLetter();
        Assert.assertArrayEquals(new int[]{-1, -1, 1, -1, -1, -1}, closestLetter.closestLetter("foobar"));
    }
}