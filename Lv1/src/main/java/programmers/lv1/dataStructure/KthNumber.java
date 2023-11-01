// K번째 수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
package programmers.lv1.dataStructure;

import java.util.Arrays;

public class KthNumber {
    // Select ith number to jth number, sort it and return kth number.
    // 1<= array.length <= 100, 1<= array.element <= 100
    // 1<= commands.length <= 50, 3 <= commands.element
    public int[] kthNumber(int[] array, int[][] commands){
        int[] result = new int[commands.length];
        int resultCount = 0;
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];

            int[] arrayCut = new int[j-i+1];
            int count = 0;
            for(; i <= j; i++){
                arrayCut[count] = array[i-1];
                count++;
            }

            Arrays.sort(arrayCut);

            result[resultCount] = arrayCut[command[2]-1];
            resultCount++;
        }
        return result;
    }
}
