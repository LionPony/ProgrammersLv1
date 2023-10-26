// 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
package programmers.lv1.dataStructure;

public class Caesar {
    // Make Caesar cipher.
    public String caesar(String s, int n){
        // Preprocess to make DLL.
        CharDLL upperCase = new CharDLL();
        CharDLL lowerCase = new CharDLL();
        for(int i = 'a'; i <= 'z'; i++){
            lowerCase.add((char) i);
        }
        for(int i = 'A'; i <= 'Z'; i++){
            upperCase.add((char) i);
        }

        StringBuilder result = new StringBuilder();

        // At each letter get n next of it.
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if('a' <= letter && letter <= 'z'){
                CharNode scan = lowerCase.getHead();
                while(scan.getLetter() != letter){
                    scan = scan.getNext();
                }
                for(int j = 0; j < n; j++){
                    scan = scan.getNext();
                }
                result.append(scan.getLetter());
            } else if ('A' <= letter && letter <= 'Z') {
                CharNode scan = upperCase.getHead();
                while(scan.getLetter() != letter){
                    scan = scan.getNext();
                }
                for(int j = 0; j < n; j++){
                    scan = scan.getNext();
                }
                result.append(scan.getLetter());
            }
            else {
                result.append(letter);
            }
        }

        return result.toString();
    }
}
