// 모의고사
// https://school.programmers.co.kr/learn/courses/30/lessons/42840
package programmers.lv1.dataStructure;

import java.util.ArrayList;

public class MockExam {
    /**
     * Find out which pattern is most likely to match answers.
     * @param answers int array.
     * @return the most similar patterns.
     */
    public int[] mockExam(int[] answers){
        // Patterns.
        int[] giveUpMathOne = new int[]{1, 2, 3, 4, 5};
        int[] giveUpMathTwo = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] giveUpMathThree = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[][] giveUpMaths = new int[][]{giveUpMathOne, giveUpMathTwo, giveUpMathThree};

        // Make hash scores of similarity.
        int[] score = new int[giveUpMaths.length];
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < giveUpMaths.length; j++){
                if(giveUpMaths[j][i%giveUpMaths[j].length] == answers[i]) {
                        score[j]++;
                }
            }
        }

        // Find the best scores. May can be several.
        int max = score[0];
        for(int i = 0; i < score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        ArrayList<Integer> highScore = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            if(score[i] == max){
                highScore.add(i+1);
            }
        }
        int[] result = new int[highScore.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = highScore.get(i);
        }

        return result;
    }
}
