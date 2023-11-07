// 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
package programmers.lv1.etc;

import java.util.Arrays;

public class LottoLowHigh {
    /**
     * Compare lottos and win_nums. Some of the numbers in lottos cant read.
     * Returns the max ranking and the least ranking according to the correct answer.
     * @param lottos numbers you choose. 0 is unreadable.
     * @param win_nums winning numbers.
     * @return [max ranking, the least ranking]
     */
    public int[] lottoLowHigh(int[] lottos, int[] win_nums) {
        int unreadable = 0;
        int correct = 0;

        for(int lotto : lottos){
            if(lotto == 0){
                unreadable++;
            }
        }

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int i = 0;
        int j = 0;
        while(i < lottos.length && j < win_nums.length){
            if(lottos[i] == win_nums[j]){
                correct++;
                i++;
                j++;
            }
            else if(lottos[i] < win_nums[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return new int[]{rank(correct+unreadable), rank(correct)};
    }

    public int rank(int correct) {
        if (correct == 0) {
            return 6;
        } else {
            return 7 - correct;
        }
    }
}
