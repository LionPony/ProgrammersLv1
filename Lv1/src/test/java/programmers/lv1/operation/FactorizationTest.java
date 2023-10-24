package programmers.lv1.operation;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


public class FactorizationTest {
    // Factorization
    @Test
    public void Factorization(){
        Factorization factorization = new Factorization();
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(6);
        test.add(9);
        test.add(12);
        test.add(18);
        test.add(36);
        ArrayList<Integer> answer = factorization.factorization(36);
        Assert.assertArrayEquals(test.toArray(), factorization.factorization(36).toArray());
    }
}