// 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.Budget;

public class BudgetTest {
    // 1<= Budget <= 10,000,000
    // d is required money list.
    // At maximum how many d can be required.
    @Test
    public void budget() {
        Budget budget = new Budget();
        Assert.assertEquals(3, budget.budget(new int[]{1, 3, 2, 5, 4}, 9));
    }
    @Test
    public void budget1() {
        Budget budget = new Budget();
        Assert.assertEquals(4, budget.budget(new int[]{2, 2, 3, 3}, 10));
    }
}