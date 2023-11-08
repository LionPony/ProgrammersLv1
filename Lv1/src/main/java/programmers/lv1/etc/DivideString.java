// 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
package programmers.lv1.etc;

public class DivideString {
    /**
     * Read first letter and count same letter and other letter.
     * If same letter and other letter count meets cut String and repeat it.
     * Figure out how many part will be made.
     * @param s Input letters.
     * @return Count of parted letters.
     */
    public int divideString(String s){
        int result = 0;
        int scan = 0;

        while (scan < s.length()){
            int same = 1;
            int other = 0;

            char start = s.charAt(scan);
            scan++;
            // Exception handle.
            if(scan == s.length()){
                result++;
            }

            while(scan < s.length()){
                char next = s.charAt(scan);
                scan++;
                if(start == next){
                    same++;
                }
                else{
                    other++;
                }

                if(same == other){
                    result++;
                    break;
                }
                // Exception Handle.
                else if(scan == s.length()){
                    result++;
                    break;
                }
            }

        }
        return result;
    }

}
