// 최대공약수와 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
package programmers.lv1.operation;

public class GCDLCM {
    //Get GCD and LCM in shape of array.
    // 1 <= n, m <= 1,000,000
    public int[] gCDLCM(int n, int m){
        return new int[]{getGCD(n, m), getLCM(n, m)};
    }
    // Get Greatest common divisor.
    public int getGCD(int n, int m){
        if(m == 0){
            return n;
        }
        else{
            return getGCD(m, n%m);
        }
    }
    // Get The Least common multiple.
    public int getLCM(int n, int m){
        int GCD = getGCD(n, m);
        return (n/GCD * m/GCD)*GCD;
    }
}
