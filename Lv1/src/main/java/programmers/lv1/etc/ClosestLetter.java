// 가장 가까운 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package programmers.lv1.etc;

public class ClosestLetter {
    public int[] closestLetter(String s){
        /*  Given string s, each letter in s wants to mark closest same letter
         *  which appears before it comes.
         *  mark is distance between same letter.
         */
        int[] result = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            boolean find = false;
            char letter = s.charAt(i);
            for(int j = i-1; j >= 0; j--){
                if(letter == s.charAt(j)){
                    result[i] = i-j;
                    find = true;
                    break;
                }
            }
            if(!find) {
                result[i] = -1;
            }
        }

        return result;
    }

}
