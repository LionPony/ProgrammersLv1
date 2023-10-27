// 숫자 문자열과 영단어
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class NumericStringTest {
    // String contains numeric and integer. Translate all and return int.
    @Test
    public void numericString(){
        NumericString numericString = new NumericString();
        Assert.assertEquals(1478, numericString.numericString("one4seveneight"));
    }
    @Test
    public void numericString1(){
        NumericString numericString = new NumericString();
        Assert.assertEquals(234567, numericString.numericString("23four5six7"));
    }
    @Test
    public void numericString2(){
        NumericString numericString = new NumericString();
        Assert.assertEquals(234567, numericString.numericString("2three45sixseven"));
    }
    @Test
    public void numericString3(){
        NumericString numericString = new NumericString();
        Assert.assertEquals(123, numericString.numericString("123"));
    }
}