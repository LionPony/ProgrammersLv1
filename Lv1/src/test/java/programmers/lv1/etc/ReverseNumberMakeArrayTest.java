// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.ReverseNumberMakeArray;

public class ReverseNumberMakeArrayTest {
    // Reverse n and make array of every digit.
    @Test
    public void reverseNumberMakeArray() {
        ReverseNumberMakeArray reverseNumberMakeArray = new ReverseNumberMakeArray();
        Assert.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverseNumberMakeArray.reverseNumberMakeArray(12345));
    }
}