// https://school.programmers.co.kr/learn/courses/30/lessons/12937
// 짝수와 홀수
package programmers.lv1.operation;

public class EvenOrOdd {
    // Classify natural number is odd or even.
    public String evenOrOdd(int num){
        if(num%2 == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
