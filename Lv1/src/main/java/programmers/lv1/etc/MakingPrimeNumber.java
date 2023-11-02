// 소수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
package programmers.lv1.etc;

import java.util.ArrayList;
import java.util.Iterator;

public class MakingPrimeNumber {
    /**
     * Make number which is sum of three elements in nums.
     * If number is prime count it.
     * @param nums numbers array.
     * @return The number of made up number is prime.
     */
    public int makingPrimeNumber(int[] nums){
        int depth = 3;
        int start = 0;
        ArrayList<Integer> sums = new ArrayList<>();

        // Combination. (Backtracking used)
        combination(new boolean[nums.length], start, depth, nums, sums);

        Iterator<Integer> scan = sums.iterator();
        int result = 0;
        while(scan.hasNext()){
            if(isPrime(scan.next())){
                result++;
            }
        }
        return result;
    }
    public boolean isPrime(int num){
        // This reduces time complexity.
        int goal = (int)Math.sqrt(num);

        for(int i = 2; i <= goal; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public void combination(boolean[] visited, int start, int depth, int[] nums, ArrayList<Integer> sums){
        if(depth == 0){
            int sum = 0;
            for(int i = 0; i < visited.length; i++){
                if(visited[i]){
                    sum += nums[i];
                }
            }
            sums.add(sum);
            return;
        }
        // Backtracking  used.
        for(int i = start; i < visited.length; i++){
            visited[i] = true;
            combination(visited, i+1, depth-1, nums, sums);
            visited[i] = false;
        }
    }
}
