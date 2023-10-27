// 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
package programmers.lv1.etc;

import java.util.ArrayList;

public class RemoveLeast {
    // Remove the smallest one in array.
    // If array is empty return {-1}.
    // 1 <= arr.length, i != j -> arr[i] != arr[j].
    public int[] removeLeast(int[] arr){
        // Find smallest one.
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }

        // Make array with out smallest one.
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : arr){
            if(i != min){
                result.add(i);
            }
        }

        int[] resultArr = {-1};
        // Exception. If result is empty, return {-1}
        if(result.isEmpty()){
            return resultArr;
        }

        // If result is not empty.
        resultArr = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
}
