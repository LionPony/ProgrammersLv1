package programmers.lv1;

import org.junit.Assert;
import org.junit.Test;

public class GetMidLetterTest {
    // Get mid letter of word s.
    // If s.length is even, return 2 letter.
    // 1 <= s.length <= 100.
    @Test
    public void getMidLetter() {
        GetMidLetter getMidLetter = new GetMidLetter();
        Assert.assertEquals("c", getMidLetter.getMidLetter("abcde"));
    }
    @Test
    public void getMidLetter1() {
        GetMidLetter getMidLetter = new GetMidLetter();
        Assert.assertEquals("we", getMidLetter.getMidLetter("qwer"));
    }
}