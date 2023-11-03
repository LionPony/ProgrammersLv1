// 과일 장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package programmers.lv1.dataStructure;

import java.util.Arrays;

public class FruitSeller {
    /*  k is the most expensive one in score.
     *  m is number to group.
     *  The cheapest one * m is price of group.
     *  Find out the way how to make most expensive groups.
     */

    public int fruitSeller(int k, int m, int[] score){
        Arrays.sort(score);
        int sum = 0;
        for(int i = score.length-m; i >= 0; i -= m){
            sum += score[i]*m;
        }
        return sum;
    }
    public void selectionSort(int[] score){
        for(int i = 0; i < score.length; i++){
            for(int j = i+1; j < score.length; j++){
                if(score[i] > score[j]){
                    swap(score, i, j);
                }
            }
        }
    }
    public void swap(int[] score, int a, int b){
        int temp = score[a];
        score[a] = score[b];
        score[b] = temp;
    }
}
