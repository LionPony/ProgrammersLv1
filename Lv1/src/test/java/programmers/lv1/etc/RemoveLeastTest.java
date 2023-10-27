// 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935

package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.RemoveLeast;

public class RemoveLeastTest {
    // Remove the smallest one in array.
    // If array is empty return {-1}.
    // 1 <= arr.length, i != j -> arr[i] != arr[j].
    @Test
    public void removeLeast() {
        RemoveLeast removeLeast = new RemoveLeast();
        Assert.assertArrayEquals(new int[]{4, 3, 2}, removeLeast.removeLeast(new int[]{4, 3, 2, 1}));
    }
    @Test
    public void removeLeast1() {
        RemoveLeast removeLeast = new RemoveLeast();
        Assert.assertArrayEquals(new int[]{-1}, removeLeast.removeLeast(new int[]{10}));
    }
}