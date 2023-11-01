// [1차]비밀지도
// https://school.programmers.co.kr/learn/courses/30/lessons/17681
package programmers.lv1.operation;

import java.util.ArrayList;

public class SecretMap {
    /** Decimal 2 maps are given
     *  Turn this into binary and overlap.
     *  If 1 is overlaped turn this into "#" if not " ".
     *  Get the decoded map.
     */
    public String[] secretMap(int n, int[] arr1, int[] arr2){
        ArrayList<String> masterMap = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr1.length; i++ ){
            sb.append(Integer.toBinaryString(arr1[i]|arr2[i]));
            int count = sb.length();
            for(int j = 0; j < n - count; j++){
                sb.insert(0, "0");
            }
            masterMap.add(sb.toString());
            sb = new StringBuilder();
        }

        String[] result = new String[arr1.length];
        for(int i = 0; i < result.length; i++){
            result[i] = decode(masterMap.get(i));
        }

        return result;
    }
    public String decode(String cipher){
        StringBuilder decoded = new StringBuilder();
        for(int i = 0; i < cipher.length(); i++){
            if(cipher.charAt(i) == '1'){
                decoded.append("#");
            }
            else if(cipher.charAt(i) == '0'){
                decoded.append(" ");
            }
        }
        return decoded.toString();
    }
}
