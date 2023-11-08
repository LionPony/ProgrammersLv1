// 완주하지 못한 선수
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
package programmers.lv1.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WhoNotFinish {
    /**
     * Find out who could not finish the race.
     * @param participant Who participate the race.
     * @param completion Who complete the race.
     * @return Who could not finish the race.
     */
    public String whoNotFinish(String[] participant, String[] completion){
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }

    // Using hash to solve same problem.
    public String whoNotFinishHash(String[] participant, String[] completion){
        HashMap<String, ArrayList<Boolean>> participantRace = new HashMap<>();
        for(String name : participant){
            if(!participantRace.containsKey(name)){
                ArrayList<Boolean> completeRace = new ArrayList<>();
                completeRace.add(false);
                participantRace.put(name, completeRace);
            }
            else {
                participantRace.get(name).add(false);
            }
        }

        for(String name : completion){
            ArrayList<Boolean> completeList = participantRace.get(name);
            completeList.add(true);
            completeList.removeFirst();
        }

        String result = "";
        for(String key : participantRace.keySet()){
            if(participantRace.get(key).contains(false)){
                result = key;
                break;
            }
        }
        return result;
    }
}
