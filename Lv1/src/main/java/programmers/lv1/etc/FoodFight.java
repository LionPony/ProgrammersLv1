// 푸드 파이트 대회
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
package programmers.lv1.etc;

public class FoodFight {
    public String foodFight(int[] food){
        StringBuilder order = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            if(food[i]/2 > 0){
                for(int j = 0; j < food[i]/2; j++){
                    order.append(i);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(order);
        result.append("0");
        result.append(order.reverse());
        return result.toString();
    }
}
