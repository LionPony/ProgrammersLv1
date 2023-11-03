// 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
package programmers.lv1.dataStructure;

import java.util.*;

public class FailRate {
    /**
     * Find out failure rate of each stages, and rank them.
     * @param N total number of stages.
     * @param stages where players plaing now.
     * @return
     */
    public int[] failRate(int N, int[] stages){
        int[] suspend = new int[N+1];
        for(int i : stages){
            suspend[i-1]++;
        }

        double[] failRate = new double[N];
        for(int i = 0; i < failRate.length; i++){
            // If player plays next stage.
            // It means he cleared stage before now.
            int challenger = 0;
            for(int j = i; j < suspend.length; j++){
                challenger += suspend[j];
            }

            // Exception handle.
            if(challenger == 0){
                failRate[i] = 0;
            }
            else{
                failRate[i] = (double)suspend[i] / (double)challenger;
            }
        }

        // Ranking
        List<Stage> stageList = new ArrayList<>();
        for(int i = 0; i < failRate.length; i++){
            Stage newStage = new Stage(i, failRate[i]);
            stageList.add(newStage);
        }
        Collections.sort(stageList);

        int[] result = new int[N];
        Iterator<Stage> scan = stageList.iterator();
        for(int i = 0; i < result.length; i++){
            result[i] = scan.next().getStage()+1;
        }

        return result;
    }
    public static class Stage implements Comparable<Stage>{
        int stage;
        double failRate;
        public Stage(int stage, double failRate){
            this.stage = stage;
            this.failRate = failRate;
        }

        public double getFailRate(){
            return failRate;
        }
        public int getStage(){
            return stage;
        }

        @Override
        public int compareTo(Stage o) {
            if(o.getFailRate() == this.getFailRate()){
                // If failRate is same compare stage.
                if(o.getStage() > this.getStage()){
                    return -1;
                }
                else{
                    return 1;
                }
            } else if (o.getFailRate() > this.getFailRate()) {
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}
