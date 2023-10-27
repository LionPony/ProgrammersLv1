// 크기가 작은 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
package programmers.lv1.etc;

public class SmallSubstrings {
    // When you substring t to length of p, small or same count it.
    // 1<= p.length <= 18, p.length <= t.length <= 10,000
    public int smallSubstrings(String t, String p){
        int count = 0;
        for(int i = 0; i <= t.length()-p.length(); i++){
            if(Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p)){
                count++;
            }
        }
        return count;
    }
}