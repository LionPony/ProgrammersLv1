// 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
package programmers.lv1.operation;

public class LeastSquare {
    // Making a square that every size fits.
    // 1<= sizes.length <= 10,000
    public int leastSquare(int[][] sizes){
        int maxOfBig = 0;
        int maxOfSmall = 0;
        int big = 0;
        int small = 0;

        for(int[] size : sizes){
            big = findBig(size);
            small = findSmall(size);
            if(big > maxOfBig){
                maxOfBig = big;
            }
            if(small > maxOfSmall){
                maxOfSmall = small;
            }
        }
        return maxOfBig*maxOfSmall;
    }
    public int findSmall(int[] size){
        int small = size[0];
        for(int i : size){
            if(small > i){
                small = i;
            }
        }
        return small;
    }
    public int findBig(int[] size){
        int big = size[0];
        for(int i : size){
            if(big < i){
                big = i;
            }
        }
        return big;
    }
}
