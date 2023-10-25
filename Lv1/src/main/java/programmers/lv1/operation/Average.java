// 평균 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

package programmers.lv1.operation;

public class Average {
    // Figure out average of integer array.
    public double average(int[] array){
        double sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum/array.length;
    }
}
