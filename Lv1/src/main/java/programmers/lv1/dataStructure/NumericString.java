// 숫자 문자열과 영단어
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
package programmers.lv1.dataStructure;

import java.util.HashMap;

public class NumericString {
    // String contains numeric and integer. Translate all and return int.
    public int numericString(String s){
        HashMap<String, String> numeric = new HashMap<>();
        String[][] words = new String[][]{{"0", "zero"}, {"1", "one"},
                {"2", "two"}, {"3", "three"}, {"4", "four"}, {"5", "five"},
                {"6", "six"}, {"7", "seven"}, {"8", "eight"}, {"9", "nine"}};
        for(String[] word : words){
            numeric.put(word[1], word[0]);
        }

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(!isInteger(letter)){
                temp.append(letter);
                if(numeric.containsKey(temp.toString())){
                    result.append(numeric.get(temp.toString()));
                    temp = new StringBuilder();
                }
            }
            else{
                result.append(letter);
            }
        }
        return Integer.parseInt(result.toString());
    }
    public boolean isInteger(char letter){
        try{
            Integer.parseInt(String.valueOf(letter));
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
