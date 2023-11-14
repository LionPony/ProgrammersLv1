// 키패드 누르기
// https://school.programmers.co.kr/learn/courses/30/lessons/67256
package programmers.lv1.etc;

import org.junit.Assert;
import org.junit.Test;

public class PushKeypadTest {
/**
 * Find out sequence of hands which push the button.
 * Keypad is just like your cellphone.
 * At first, left hand is on '*' and the other '#'
 * 1, 4, 7 is only left hand do. 3, 6, 9 is the other.
 * 2, 5, 8, 0 are the closest hand pushes.
 **/
    @Test
    public void pushKeypad() {
        PushKeypad pushKeypad = new PushKeypad();
        Assert.assertEquals("LRLLLRLLRRL", pushKeypad.pushKeypad(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    }
    @Test
    public void pushKeypad1() {
        PushKeypad pushKeypad = new PushKeypad();
        Assert.assertEquals("LRLLRRLLLRR", pushKeypad.pushKeypad(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }
    @Test
    public void pushKeypad2() {
        PushKeypad pushKeypad = new PushKeypad();
        Assert.assertEquals("LLRLLRLLRL", pushKeypad.pushKeypad(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
    @Test
    public void pushKeypad3() {
        PushKeypad pushKeypad = new PushKeypad();
        Assert.assertEquals("RR", pushKeypad.pushKeypad(new int[]{0, 0}, "right"));
    }
}