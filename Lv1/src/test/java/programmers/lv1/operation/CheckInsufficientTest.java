// 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.CheckInsufficient;

public class CheckInsufficientTest {
    // Try to find out how much insufficient to pay.
    // After you use it. Price goes n times.
    // 1<=price<2,500 / 1<=money<=1,000,000,000 / 1<=count<=2,500
    @Test
    public void checkInsufficient() {
        CheckInsufficient checkInsufficient = new CheckInsufficient();
        Assert.assertEquals(10, checkInsufficient.checkInsufficient(3, 20, 4));
    }
}