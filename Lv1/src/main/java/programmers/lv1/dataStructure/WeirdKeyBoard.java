// 대충 만든 자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
package programmers.lv1.dataStructure;

import java.util.HashMap;

public class WeirdKeyBoard {
    /**
     * Each key has various variables.
     * Find out the minimal touch to make targets.
     * @param keymap Each keys setting.
     * @param targets What we try to make.
     * @return The minimal touch to make targets.
     */
    public int[] weirdKeyBoard(String[] keymap, String[] targets){
        HashMap<String, Integer> keyMaps = new HashMap<>();
        for(String key : keymap){
            String[] keys = key.split("");
            for(int i = 0; i < keys.length; i++){
                if(keyMaps.containsKey(keys[i])){
                    keyMaps.put(keys[i], Math.min(keyMaps.get(keys[i]), i));
                }
                else{
                    keyMaps.put(keys[i], i);
                }
            }
        }

        int[] result = new int[targets.length];

        for(int i = 0; i < targets.length; i++){
            String[] target = targets[i].split("");
            int sum = 0;
            for(int j = 0; j < target.length; j++){
                if(keyMaps.containsKey(target[j])){
                    sum += keyMaps.get(target[j])+1;
                }
                else{
                    sum = -1;
                    break;
                }
            }
            result[i] = sum;
        }

        return result;
    }
}
