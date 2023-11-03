// 옹알이 (2)
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
package programmers.lv1.etc;

import java.util.Arrays;
import java.util.HashSet;

public class Babbling2 {
    /**
     * Find how many words can be pronounced in babbling array.
     * Duplicated babbling is not counted.
     * @param babbling 1 <= length <= 100, 1 <= elements <= 30
     * @return Number of baby can speak.
     */
    public int babbling2(String[] babbling){
        String[] dictionary = new String[]{"aya", "ye", "woo", "ma"};
        HashSet<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));

        StringBuilder temp;
        int count = 0;

        for(String bab : babbling){
            temp = new StringBuilder();
            String prev = "";

            for(int i = 0; i < bab.length(); i++){
                temp.append(bab.charAt(i));

                if(dictionarySet.contains(temp.toString())){
                    if(prev.equals(temp.toString())){
                        continue;
                    }

                    prev = temp.toString();
                    temp = new StringBuilder();

                }
            }

            if(temp.isEmpty()){
                count++;
            }
        }

        return count;
    }
}
