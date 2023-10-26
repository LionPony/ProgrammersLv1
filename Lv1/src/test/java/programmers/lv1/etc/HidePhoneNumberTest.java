// 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.etc.HidePhoneNumber;

public class HidePhoneNumberTest {
    // Except 4 numbers from behind, turn others to *.
    @Test
    public void hidePhoneNumber() {
        HidePhoneNumber hidePhoneNumber = new HidePhoneNumber();
        Assert.assertEquals("*******4444", hidePhoneNumber.hidePhoneNumber("01033334444"));
    }
    @Test
    public void hidePhoneNumber1() {
        HidePhoneNumber hidePhoneNumber = new HidePhoneNumber();
        Assert.assertEquals("*****8888", hidePhoneNumber.hidePhoneNumber("027778888"));
    }
}