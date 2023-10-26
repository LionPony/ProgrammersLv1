// https://school.programmers.co.kr/learn/courses/30/lessons/12931
// 자릿수 더하기
package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.operation.AddDigits;

public class AddDigitsTest {
    // Add every digit in natural number.
    @Test
    public void addDigits(){
        AddDigits addDigits = new AddDigits();
        Assert.assertEquals(addDigits.addDigits(123), 6);
    }

    @Test
    public void addDigits1(){
        AddDigits addDigits = new AddDigits();
        Assert.assertEquals(addDigits.addDigits(123), 6);
    }

}