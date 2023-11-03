// 카드 뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
package programmers.lv1.dataStructure;

import java.util.Stack;

public class CardDeck {
    // If you can make goal by cards1, cards2 which has an order return "Yes". If not return "No".
    public String cardDeck(String[] cards1, String[] cards2, String[] goal){
        Stack<String> cardDeck1 = new Stack<>();
        Stack<String> cardDeck2 = new Stack<>();
        Stack<String> cardDeckGoal = new Stack<>();

        for(int i = cards1.length-1; i >= 0; i--){
            cardDeck1.push(cards1[i]);
        }
        for(int i = cards2.length-1; i >= 0; i--){
            cardDeck2.push(cards2[i]);
        }
        for(int i = goal.length-1; i >= 0; i--){
            cardDeckGoal.push(goal[i]);
        }

        while(!cardDeckGoal.isEmpty()){
            String goalCard = cardDeckGoal.pop();
            if(!cardDeck1.isEmpty() && cardDeck1.peek().equals(goalCard)){
                cardDeck1.pop();
            }
            else if(!cardDeck2.isEmpty() && cardDeck2.peek().equals(goalCard)){
                cardDeck2.pop();
            }
            else{
                return "No";
            }
        }
        return "Yes";
    }
}
