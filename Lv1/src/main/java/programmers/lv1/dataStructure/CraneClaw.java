// 크레인 인형뽑기 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
package programmers.lv1.dataStructure;

import java.util.Stack;

public class CraneClaw {
    /**
     * Doll claw machine game.
     * You pick one in board and take it to basckt.
     * Same dolls meet in bascket it broke down and score goes up.
     * @param board Game board.
     * @param moves Pick doll in lane.
     * @return Total score.
     */
    public int craneClaw(int[][] board, int[] moves){
        Stack<Integer> basket = new Stack<>();
        int score = 0;

        for(int move : moves){
            int doll = grep(board, move);
            if(doll != 0){
                if(basket.empty()){
                    basket.push(doll);
                }
                else{
                    if(basket.peek() == doll){
                        basket.pop();
                        score++;
                    }
                    else{
                        basket.push(doll);
                    }
                }
            }
        }
        return score*2;
    }
    public int grep(int[][] board, int move) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][move - 1] != 0) {
                int doll = board[i][move - 1];
                board[i][move - 1] = 0;
                return doll;
            }
        }
        return 0;
    }
}