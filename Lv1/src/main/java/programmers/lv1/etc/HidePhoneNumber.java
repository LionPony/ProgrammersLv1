// 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
package programmers.lv1.etc;

public class HidePhoneNumber {
    // Except 4 numbers from behind, turn others to *.
    public String hidePhoneNumber(String phone_number){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < phone_number.length()-4; i++){
            result.append("*");
        }
        for(int i = phone_number.length()-4; i < phone_number.length(); i++){
            result.append(phone_number.charAt(i));
        }
        return result.toString();
    }
}
