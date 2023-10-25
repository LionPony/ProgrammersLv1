// 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
package programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;

public class DivisibleArray {
    /** Make array of elements of array which divisible by divisor.
        Sort ascending order. If element is null return array which only has -1.
        arr is natural numbers array.
        If i != j -> arr[i] != arr[j]
        divisor is natural number.
        1 <= array.length
     **/
    public int[] divisibleArray(int[] arr, int divisor){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0){
                result.add(i);
            }
        }

        if(result.isEmpty()){
            return new int[]{-1};
        }

        result.sort(Comparator.naturalOrder());

        int[] resultArray = new int[result.size()];
        for(int i = 0; i < resultArray.length; i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
