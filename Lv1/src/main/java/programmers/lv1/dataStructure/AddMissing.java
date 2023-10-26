// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
package programmers.lv1.dataStructure;

public class AddMissing {
    // 0~9 which not included in numbers array, return sum of them.
    public int addMissing(int[] numbers){
        int[] numbersHash = new int[10];
        for(int i : numbers){
            numbersHash[i] = -1;
        }

        int sum = 0;
        for(int i = 0; i < numbersHash.length; i++){
            if(numbersHash[i] != -1){
                sum += i;
            }
        }

        return sum;
    }
}
