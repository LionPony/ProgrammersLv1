package programmers.lv1;

import Operator.Multiplier;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.Multiply(2,6));
        System.out.println(multiplier.Multiply(2,3,4));
    }
}
