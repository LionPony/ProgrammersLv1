// 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
package programmers.lv1;

public class Watermelon {
    // Make patterned string. n(natural number) <= 10,000
    // Example : n = 3 수박수, n = 4 수박수박
    public String watermelon(int n){
        String subak = "수박";
        subak = subak.repeat(n/2);
        if(n%2 != 0){
            subak += "수";
        }
        return subak;
    }
}
