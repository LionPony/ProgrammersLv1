// 둘만의 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class CipherBetweenTwoTest {
/**
 * Make the cipher by rules.
 * Alphabet in s should go backward as much as index.
 * While going back if alphabet meets alphabets in skip, go once more.
 * Find out completed cipher.
 **/
    @Test
    public void cipherBetweenTwo() {
        CipherBetweenTwo cipherBetweenTwo = new CipherBetweenTwo();
        Assert.assertEquals("happy", cipherBetweenTwo.cipherBetweenTwo("aukks", "wbqd", 5));
    }
}