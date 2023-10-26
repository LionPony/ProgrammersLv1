// 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
package programmers.lv1;

public class WeirdString {
    // Make string char at odd be lower case, even be upper case.
    public String weirdString(String s){
        String[] stream = s.split("");
        int count = 0;
        for(int i  = 0; i < stream.length; i++){
            if(!stream[i].equals(" ")){
                if(count%2 == 0){
                    stream[i] = stream[i].toUpperCase();
                }
                else {
                    stream[i] = stream[i].toLowerCase();
                }
                count++;
            }
            else{
                count = 0;
            }
        }
        StringBuilder result = new StringBuilder();
        for(String i : stream){
            result.append(i);
        }
        return result.toString();
    }
}