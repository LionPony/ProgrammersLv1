// 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class PhonecketMonTest {

    @Test
    public void phonecketMon() {
        PhonecketMon phonecketMon = new PhonecketMon();
        Assert.assertEquals(2, phonecketMon.phonecketMon(new int[]{3,1,2,3}));
    }
    @Test
    public void phonecketMon1() {
        PhonecketMon phonecketMon = new PhonecketMon();
        Assert.assertEquals(3, phonecketMon.phonecketMon(new int[]{3,3,3,2,2,4}));
    }
    @Test
    public void phonecketMon2() {
        PhonecketMon phonecketMon = new PhonecketMon();
        Assert.assertEquals(2, phonecketMon.phonecketMon(new int[]{3,3,3,2,2,2}));
    }
}