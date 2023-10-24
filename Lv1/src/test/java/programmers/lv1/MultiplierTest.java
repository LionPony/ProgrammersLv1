package programmers.lv1;

import Operator.Multiplier;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplierTest {

    @Test
    public void multiply() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(8,9),72);
    }

    @Test
    public void Multiply1() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(2,3,4),24);
    }
}