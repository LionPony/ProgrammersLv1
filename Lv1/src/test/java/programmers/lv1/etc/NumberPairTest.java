package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class NumberPairTest {
    /**
     * Make the biggest number by duplicates.
     * @param X number in letters
     * @param Y number in letters
     * @return the biggest number made by duplicates.
     */
    @Test
    public void numberPair() {
        NumberPair numberPair = new NumberPair();
        Assert.assertEquals("-1", numberPair.numberPair("100", "2345"));
    }
    @Test
    public void numberPair1() {
        NumberPair numberPair = new NumberPair();
        Assert.assertEquals("0", numberPair.numberPair("100", "203045"));
    }
    @Test
    public void numberPair2() {
        NumberPair numberPair = new NumberPair();
        Assert.assertEquals("10", numberPair.numberPair("100", "123450"));
    }
    @Test
    public void numberPair3() {
        NumberPair numberPair = new NumberPair();
        Assert.assertEquals("321", numberPair.numberPair("12321", "42531"));
    }
    @Test
    public void numberPair4() {
        NumberPair numberPair = new NumberPair();
        Assert.assertEquals("552", numberPair.numberPair("5525", "1255"));
    }
}