// 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12921
package programmers.lv1.operation;

public class FindPrime {
    /**
     * Count prime number under n
     * @param n = natural number over 2, under 1,000,000
     * @return The number of prime numbers under n.
     */
    public int findPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        int goal = (int)Math.sqrt(n);
        for(int i = 2; i <= goal; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
