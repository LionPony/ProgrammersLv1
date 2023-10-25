// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class IntNaturalOrderTest {
    // Descent order n's digits.
    // 1<= n < 8,000,000,000
    @Test
    public void intNaturalOrder() {
        IntNaturalOrder intNaturalOrder = new IntNaturalOrder();
        Assert.assertEquals(873211, intNaturalOrder.intNaturalOrder(118372));
    }
}