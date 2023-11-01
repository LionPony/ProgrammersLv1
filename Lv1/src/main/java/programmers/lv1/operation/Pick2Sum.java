// 두 개 뽑아서 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
package programmers.lv1.operation;

import java.util.Arrays;
import java.util.HashSet;

public class Pick2Sum {
    // Pick different 2 in array and add it.
    // Make every cases of array and sort it in ascending array.
    public int[] pick2Sum(int[] numbers){
        HashSet<Integer> sums = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if( i != j ){
                    sums.add(numbers[i]+numbers[j]);
                }
            }
        }

        int[] result = new int[sums.size()];
        Integer[] sumsArr = sums.toArray(new Integer[0]);
        for(int i = 0; i < result.length; i++){
            result[i] = sumsArr[i];
        }
        Arrays.sort(result);
        return result;
    }
}
