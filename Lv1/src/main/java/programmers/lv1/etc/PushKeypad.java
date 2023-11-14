// 키패드 누르기
// https://school.programmers.co.kr/learn/courses/30/lessons/67256
package programmers.lv1.etc;

public class PushKeypad {
    /**
     * Find out sequence of hands which push the button.
     * Keypad is just like your cellphone.
     * At first, left hand is on '*' and the other '#'
     * 1, 4, 7 is only left hand do. 3, 6, 9 is the other.
     * 2, 5, 8, 0 are the closest hand pushes.
     * @param numbers Keypad numbers you push.
     * @param hand hander.
     * @return sequence of hands which push the button.
     */
    public String pushKeypad(int[] numbers, String hand){
        StringBuilder answer = new StringBuilder();

        KeypadUser keypadUser = new KeypadUser(hand);
        for(int number : numbers){
            answer.append(keypadUser.keyInput(number));
        }

        return answer.toString();
    }
    private static class KeypadUser {
        private final String handed;
        private char posLeft;
        private char posRight;
        private final Keypad keypad;
        public KeypadUser(String handed){
            this.posLeft = '*';
            this.posRight = '#';
            this.keypad = new Keypad();
            this.handed = handed;
        }
        private char keyInput(int number){
            if(number == 1 || number == 4 || number == 7) {
                posLeft = (char) number;
                return 'L';
            }
            else if (number == 3 || number == 6 || number == 9) {
                posRight = (char) number;
                return 'R';
            }
            else {
                int leftDis = keypad.getDistance(posLeft, (char)number);
                int rightDis = keypad.getDistance(posRight, (char)number);
                if(leftDis < rightDis){
                    posLeft = (char) number;
                    return 'L';
                }
                else if (leftDis > rightDis) {
                    posRight = (char) number;
                    return 'R';
                }
                else {
                    if(handed.equals("right")){
                        posRight = (char) number;
                        return 'R';
                    }
                    else {
                        posLeft = (char) number;
                        return 'L';
                    }
                }
            }
        }
    }
    private static class Keypad {
        private final char[][] keypad =   {{1, 2, 3},
                                            {4, 5, 6},
                                            {7 ,8, 9},
                                            {'*', 0, '#'}};
        private int getDistance(char start, char destination){
            int[] startPos = getPos(start);
            int[] destinatioPos = getPos(destination);
            // Manhattan Distance.
            return getDiff(startPos[0], destinatioPos[0]) + getDiff(startPos[1], destinatioPos[1]);
        }
        private int getDiff(int a, int b){
            if(a > b){
                return a-b;
            }
            else{
                return b-a;
            }
        }
        private int[] getPos(char pos){
            for(int i = 0; i < keypad.length; i++){
                for(int j = 0; j < keypad[i].length; j++){
                    if(pos == keypad[i][j]){
                        return new int[]{i, j};
                    }
                }
            }
            // Exception Handle.
            return new int[]{-1, -1};
        }
    }
}
