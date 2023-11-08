// 둘만의 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
package programmers.lv1.etc;

import java.util.HashSet;

public class CipherBetweenTwo {
    /**
     * Make the cipher by rules.
     * Alphabet in s should go backward as much as index.
     * While going back if alphabet meets alphabets in skip, go once more.
     * Find out completed cipher.
     * @param s String to make cipher
     * @param skip Set of skip alphabets.
     * @param index How much you should go back.
     * @return Maden cipher.
     */
    public String cipherBetweenTwo(String s, String skip, int index){
        HashSet<Character> needSkip = new HashSet<>();
        for(int i = 0; i < skip.length(); i++){
            needSkip.add(skip.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            for(int j = 0; j < index; j++){
                letter = push(letter);
                while (needSkip.contains(letter)){
                    letter = push(letter);
                }
            }
            result.append(letter);
        }
        return result.toString();
    }
    public char push(char a){
        a += 1;
        if(a > 'z'){
            return (char) (a%'z' + 'a' -1);
        }
        return a;
    }
}
