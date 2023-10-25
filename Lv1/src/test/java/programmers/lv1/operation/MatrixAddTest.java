// 행렬의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/12950
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixAddTest {
    // Matrix add.
    @Test
    public void matrixAdd() {
        MatrixAdd matrixAdd = new MatrixAdd();
        Assert.assertTrue(Arrays.deepEquals(new int[][]{{4, 6},{7, 9}}, matrixAdd.matrixAdd(new int[][]{{1, 2},{2, 3}}, new int[][]{{3, 4},{5, 6}})));
    }
    @Test
    public void matrixAdd1() {
        MatrixAdd matrixAdd = new MatrixAdd();
        Assert.assertTrue(Arrays.deepEquals(new int[][]{{4},{6}}, matrixAdd.matrixAdd(new int[][]{{1},{2}}, new int[][]{{3},{4}})));
    }
}