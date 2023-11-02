// 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
package programmers.lv1.dataStructure;

import java.util.HashMap;

public class MemoryScore {
    /** Each person name has its own score.
     *  Make memory score array by photo.
     *  In photo there can be many people.
     *  name array is person name, and yearning is score of person.
     *  name[i] matches yearning[i]
    **/
    public int[] memoryScore(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> scoreBoard = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreBoard.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];
        int count = 0;
        for (String[] people : photo) {
            for (String person : people) {
                if(scoreBoard.containsKey(person)){
                    result[count] += scoreBoard.get(person);
                }
            }
            count++;
        }

        return result;
    }
}
