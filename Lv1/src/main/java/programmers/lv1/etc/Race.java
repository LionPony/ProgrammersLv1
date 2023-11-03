// 달리기 경주
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
package programmers.lv1.etc;

import java.util.HashMap;

public class Race {
    /**
     * When caster calls name, player overrun the front.
     * After all callings are done, figure out the players ranking list.
     */
    public String[] race(String[] players, String[] callings){
        HashMap<String, Integer> playersMap = new HashMap<>();
        HashMap<Integer, String> rankMap = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            playersMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for(String call : callings){
            swap(playersMap, rankMap, call);
        }

        String[] result = new String[players.length];
        for(int i = 0; i < result.length; i++){
            result[i] = rankMap.get(i);
        }

        return result;
    }
    public void swap(HashMap<String, Integer> playersMap, HashMap<Integer, String> rankMap, String call){
        int rank = playersMap.get(call);
        String otherName = rankMap.get(rank-1);

        playersMap.put(call, rank-1);
        playersMap.put(otherName, rank);

        rankMap.put(rank, otherName);
        rankMap.put(rank-1, call);
    }
}
