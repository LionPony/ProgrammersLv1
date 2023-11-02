// 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
package programmers.lv1.dataStructure;

import java.util.HashSet;

public class PhonecketMon {
    public int phonecketMon(int[] nums){
        HashSet<Integer> result = new HashSet<>();
        for(int i : nums){
            result.add(i);
        }
        if(nums.length/2 > result.size()){
            return result.size();
        }
        else{
            return nums.length/2;
        }
    }
}
