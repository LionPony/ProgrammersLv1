// 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class SortStringMyMindTest {
    // Sort the Strings in ascending order by nth letter.
    // If nth letter is same order it by dictionary.
    @Test
    public void sortStringMyMind() {
        SortStringMyMind sortStringMyMind = new SortStringMyMind();
        Assert.assertArrayEquals(new String[]{"car", "bed", "sun"}, sortStringMyMind.sortStringMyMind(new String[]{"sun", "bed", "car"}, 1));
    }

    @Test
    public void sortStringMyMind1() {
        SortStringMyMind sortStringMyMind = new SortStringMyMind();
        Assert.assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, sortStringMyMind.sortStringMyMind(new String[]{"abce", "abcd", "cdx"}, 2));
    }
}