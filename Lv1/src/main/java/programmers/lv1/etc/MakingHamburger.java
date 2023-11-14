// 햄버거 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
package programmers.lv1.etc;

import java.util.Stack;

public class MakingHamburger {
    /**
     * When fixed order comes in delete it from sequence.
     * Keep delete fixed order after deleted.
     * @param ingredient sequence of numbers
     * @return how many fixed order is in sequence
     */
    public int makingHamburger(int[] ingredient){
        Stack<Integer> ingredientStack =  new Stack<>();
        Stack<Integer> checkStack =  new Stack<>();

        // Fixed order
        String hamburger = "1231";

        // Total times of fixed order appears.
        int result = 0;

        for(int ingredients : ingredient){
            ingredientStack.push(ingredients);

            // Meet fixed order`s last char and stack has more than order`s size
            if(ingredientStack.peek() == Character.getNumericValue(hamburger.charAt(hamburger.length()-1))
                    && ingredientStack.size() >= hamburger.length()){

                // Take out order size from stack.
                StringBuilder checkString = new StringBuilder();
                for(int i = 0; i < hamburger.length(); i++){
                    int checkIngredient = ingredientStack.pop();
                    checkString.append(checkIngredient);
                    checkStack.push(checkIngredient);
                }

                // If what take out from stack is order count.
                if(checkString.reverse().toString().equals(hamburger)){
                    checkStack.clear();
                    result++;
                }

                // Else return it to stack.
                else{
                    while(!checkStack.isEmpty()){
                        ingredientStack.push(checkStack.pop());
                    }
                }
            }
        }

        return result;
    }
}