// 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
package programmers.lv1.dataStructure;

import java.util.PriorityQueue;

public class HallOfFame {
    // Return each time when new score comes, array of the smallest score in k numbers of ranking.
    public int[] hallOfFame(int k, int[] score){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int[] result = new int[score.length];
        int count = 0;
        for(int i : score){
            priorityQueue.add(i);
            if(priorityQueue.size() > k){
                priorityQueue.remove();
            }

            result[count] = priorityQueue.peek();
            count++;
        }
        return result;
    }
}
