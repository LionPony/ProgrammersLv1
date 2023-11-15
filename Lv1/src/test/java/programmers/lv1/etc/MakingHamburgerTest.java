package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class MakingHamburgerTest {
/**
 * When fixed order comes in delete it from sequence.
 * Keep delete fixed order after deleted.
 **/
    @Test
    public void makingHamburger() {
        MakingHamburger makingHamburger = new MakingHamburger();
        Assert.assertEquals(2, makingHamburger.makingHamburger(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
    @Test
    public void makingHamburger1() {
        MakingHamburger makingHamburger = new MakingHamburger();
        Assert.assertEquals(0, makingHamburger.makingHamburger(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
}