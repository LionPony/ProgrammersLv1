package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;

public class SecretMapTest {
    /** Decimal 2 maps are given
     *  Turn this into binary and overlap.
     *  If 1 is overlaped turn this into "#" if not " ".
     *  Get the decoded map.
     */
    @Test
    public void secretMap() {
        SecretMap secretMap = new SecretMap();
        Assert.assertArrayEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"}, secretMap.secretMap(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
    }

    @Test
    public void secretMap2() {
        SecretMap secretMap = new SecretMap();
        Assert.assertArrayEquals(new String[]{"#### ", "    #", "# # #", "#   #", "###  "}, secretMap.secretMap(5, new int[]{0, 0, 0, 0, 0}, new int[]{30, 1, 21, 17, 28}));
    }

    @Test
    public void secretMap1() {
        SecretMap secretMap = new SecretMap();
        Assert.assertArrayEquals(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}, secretMap.secretMap(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}));
    }
}