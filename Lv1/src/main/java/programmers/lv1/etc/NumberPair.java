// 숫자 짝꿍
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
package programmers.lv1.etc;

public class NumberPair {
    /**
     * Make the biggest number by duplicates.
     * @param X number in letters
     * @param Y number in letters
     * @return the biggest number made by duplicates.
     */
    public String numberPair(String X, String Y){
        int[] componentsX = new int[10];
        int[] componentsY = new int[10];

        for(int i = 0; i < X.length(); i++){
            componentsX[Integer.parseInt(String.valueOf(X.charAt(i)))]++;
        }
        for(int i = 0; i < Y.length(); i++){
            componentsY[Integer.parseInt(String.valueOf(Y.charAt(i)))]++;
        }

        int[] setOfMin = new int[10];
        for(int i = 0; i < setOfMin.length; i++){
            setOfMin[i] = Math.min(componentsX[i], componentsY[i]);
        }

        StringBuilder result = new StringBuilder();
        for(int i = setOfMin.length-1; i >= 0; i--){
            for(int j = 0; j < setOfMin[i]; j++){
                result.append(i);
            }
        }

        if(result.isEmpty()){
            return "-1";
        }
        if(result.charAt(0) == '0'){
            return "0";
        }
        return result.toString();
    }
}
