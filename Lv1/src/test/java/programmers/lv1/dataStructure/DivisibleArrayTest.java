// 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.dataStructure.DivisibleArray;

public class DivisibleArrayTest {
    /** Make array of elements of array which divisible by divisor.
     Sort ascending order. If element is null return array which only has -1.
     arr is natural numbers array.
     If i != j -> arr[i] != arr[j]
     divisor is natural number.
     1 <= array.length
     **/
    @Test
    public void divisibleArray() {
        DivisibleArray divisibleArray = new DivisibleArray();
        Assert.assertArrayEquals(new int[]{5, 10}, divisibleArray.divisibleArray(new int[]{5, 9, 7, 10}, 5));
    }
    @Test
    public void divisibleArray1() {
        DivisibleArray divisibleArray = new DivisibleArray();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 36}, divisibleArray.divisibleArray(new int[]{2, 36, 1, 3}, 1));
    }
    @Test
    public void divisibleArray2() {
        DivisibleArray divisibleArray = new DivisibleArray();
        Assert.assertArrayEquals(new int[]{-1}, divisibleArray.divisibleArray(new int[]{3, 2, 6}, 10));
    }
}