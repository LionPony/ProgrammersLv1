package programmers.lv1.operation;

import java.util.ArrayList;
import java.util.Comparator;

public class Factorization {
    public ArrayList<Integer> factorization(int n){
        // Factorization

        // Make half factors first.
        // It can reduce time complexity. O(N) -> O(root N)
        ArrayList<Integer> factorsHalf = new ArrayList<>();
        int half = (int) Math.sqrt(n);
        for(int i = 1; i <= half; i++){
            if(n%i == 0){
                factorsHalf.add(i);
            }
        }

        // Make other half base on half.
        ArrayList<Integer> factorsOtherHalf = new ArrayList<>();
        for (Integer integer : factorsHalf) {
            factorsOtherHalf.add(n / integer);
        }

        ArrayList<Integer> allFactors = new ArrayList<>();
        allFactors.addAll(factorsHalf);
        allFactors.addAll(factorsOtherHalf);

        allFactors.sort(Comparator.naturalOrder());

        // If square root of n is integer. It duplicates.
        if(Math.pow((int) Math.sqrt(n), 2) == n && n != 0){
            allFactors.remove(allFactors.size()/2);
        }

        return allFactors;
    }
}
