// 개인정보 수집 유효기간
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {
    /**
     * Find out which privacy is expired
     */

    @Test
    public void validation() {
        Validation validation = new Validation();
        Assert.assertArrayEquals(new int[]{1, 3}, validation.validation("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}));
    }
    @Test
    public void validation1() {
        Validation validation = new Validation();
        Assert.assertArrayEquals(new int[]{1, 4, 5}, validation.validation("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}));
    }
    @Test
    public void validation2() {
        Validation validation = new Validation();
        Assert.assertArrayEquals(new int[]{1}, validation.validation("2009.12.31", new String[]{"A 13"}, new String[]{"2008.11.03 A"}));
    }
}