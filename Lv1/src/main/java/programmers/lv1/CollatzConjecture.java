// 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
package programmers.lv1;

public class CollatzConjecture {
    /** Collatz Conjecture
        If given number is even divide 2.
        If given number is odd multiply 3 and add 1.
        Do same job until given becomes 1.
        Return how many times operation happened.
        1 <= num < 8,000,000
     **/
    public int collatzConjecture(int num){
        return collatzConjecture(num, 0);
    }

    public int collatzConjecture(long num, int count){
        // Recursive used.
        if(num == 1){
            return count;
        }
        else if (count > 500) {
            return -1;
        }
        else if(num%2 == 0){
            return collatzConjecture(num/2, count+1);
        }
        else{
            return collatzConjecture(num*3+1, count+1);
        }
    }
}
