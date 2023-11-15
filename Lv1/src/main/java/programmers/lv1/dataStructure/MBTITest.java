// 성격 유형 검사하기
// https://school.programmers.co.kr/learn/courses/30/lessons/118666
package programmers.lv1.dataStructure;

import java.util.Collections;
import java.util.LinkedHashMap;

public class MBTITest {
    /**
     * Organize survey and find out result.
     * Survey has 4 groups of charater type.
     * The charater with the maximum score in indicators make mbti.
     * @param survey groups of charcter type.
     * @param choices scores of survey.
     * @return result of survey.
     */
    public String mbtiTest(String[] survey, int[] choices){
        // Preprocess
        String[] indicators = {"RT", "CF", "JM", "AN"};
        LinkedHashMap<String, LinkedHashMap<Character, Integer>> indicatorsMap = new LinkedHashMap<>();

        for(String indicator : indicators){
            LinkedHashMap<Character, Integer> scores = new LinkedHashMap<>();
            scores.put(indicator.charAt(0), 0);
            scores.put(indicator.charAt(1), 0);

            indicatorsMap.put(indicator, scores);
        }

        for(int i = 0; i < survey.length; i++){
            int indicatorIndex = choices[i]/4;
            char type = survey[i].charAt(indicatorIndex);

            int score;
            if(indicatorIndex > 0){
                score = choices[i]%4;
            }
            else{
                score = 4-choices[i];
            }

            // Indicator can be reversed.
            LinkedHashMap<Character, Integer> scores;
            if(indicatorsMap.containsKey(survey[i])){
                scores = indicatorsMap.get(survey[i]);
            }
            else {
                StringBuilder reverse = new StringBuilder(survey[i]);
                scores = indicatorsMap.get(reverse.reverse().toString());
            }

            scores.put(type, scores.get(type) + score);
        }

        StringBuilder result = new StringBuilder();
        for(String key : indicatorsMap.keySet()){
            LinkedHashMap<Character, Integer> scores = indicatorsMap.get(key);
            Character type = getMaxType(scores);
            result.append(type);
        }

        return result.toString();
    }
    public Character getMaxType(LinkedHashMap<Character, Integer> scores){
        Integer maxValue = Collections.max(scores.values());

        Character maxKey = 'x';
        for(Character key : scores.keySet()){
            if(scores.get(key).equals(maxValue)){
                maxKey = key;
                return maxKey;
            }
        }
        return maxKey;
    }
}