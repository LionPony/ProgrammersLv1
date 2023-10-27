// 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
package programmers.lv1.dataStructure;

import java.util.ArrayList;

public class RemoveDuplicated {
    // Leave only one in continuous numbers.
    // array.length(natural number) <= 1,000,000, 0 <= array.elements <= 9
    public int[] removeDuplicated(int[] arr){
       int prev = -1;
       int now;
       ArrayList<Integer> result = new ArrayList<>();

       for(int i : arr){
           now = i;
           if(now != prev){
                result.add(now);
           }
           prev = now;
       }

       int[] resultArr = new int[result.size()];
       for(int i = 0; i < resultArr.length; i++){
           resultArr[i] = result.get(i);
       }

       return resultArr;
    }
}