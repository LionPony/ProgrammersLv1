package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class MockExamTest {
    /**
     * Find out which pattern is most likely to match answers.
     */
    @Test
    public void mockExam() {
        MockExam mockExam = new MockExam();
        Assert.assertArrayEquals(new int[]{1}, mockExam.mockExam(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void mockExam1() {
        MockExam mockExam = new MockExam();
        Assert.assertArrayEquals(new int[]{1,2,3}, mockExam.mockExam(new int[]{1,3,2,4,2}));
    }
    @Test
    public void mockExam2() {
        MockExam mockExam = new MockExam();
        Assert.assertArrayEquals(new int[]{1, 3}, mockExam.mockExam(new int[]{1, 1, 1, 1, 1, 1}));
    }
    @Test
    public void mockExam3() {
        MockExam mockExam = new MockExam();
        Assert.assertArrayEquals(new int[]{1, 2}, mockExam.mockExam(new int[]{5, 5, 5, 5, 5, 5, 5, 5}));
    }
    @Test
    public void mockExam4() {
        MockExam mockExam = new MockExam();
        Assert.assertArrayEquals(new int[]{1}, mockExam.mockExam(new int[]{1, 2}));
    }
}