// 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
package programmers.lv1.operation;

public class SumBtw2Nums {
    // Sum between two integers.
    public long sumBtw2Nums(int a, int b){
        long small = compareSmall(a, b);
        long big = compareBig(a, b);
        if(small == big){
            return small;
        }
        //Sum of Arithmetic sequence.
        long n = big - small;
        return (2*small+n)*(n+1) / 2;
    }
    public int compareSmall(int a, int b){
        // Return bigger one.
        if(a <= b){
            return a;
        }
        return b;
    }
    public int compareBig(int a, int b){
        // Return smaller one.
        if(a <= b){
            return b;
        }
        return a;
    }
}
