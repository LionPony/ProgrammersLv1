// 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class LottoLowHighTest {
    /**
     * Compare lottos and win_nums. Some of the numbers in lottos cant read.
     * Returns the max ranking and the least ranking according to the correct answer.
     */
    @Test
    public void lottoLowHigh() {
        LottoLowHigh lottoLowHigh = new LottoLowHigh();
        Assert.assertArrayEquals(new int[]{3, 5}, lottoLowHigh.lottoLowHigh(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
    }
    @Test
    public void lottoLowHigh1() {
        LottoLowHigh lottoLowHigh = new LottoLowHigh();
        Assert.assertArrayEquals(new int[]{1, 6}, lottoLowHigh.lottoLowHigh(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}));
    }
    @Test
    public void lottoLowHigh2() {
        LottoLowHigh lottoLowHigh = new LottoLowHigh();
        Assert.assertArrayEquals(new int[]{1, 1}, lottoLowHigh.lottoLowHigh(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}));
    }
}