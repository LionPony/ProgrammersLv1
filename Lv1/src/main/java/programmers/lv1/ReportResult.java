// 신고 결과 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
package programmers.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ReportResult {
    /** Count how many report result will user get.
     * report arry is set of A report B
     * If someone who reported k over reporter would get alarm.
     * 2 <= id_list <= 1000, 1<= report <= 200,000, 1 <= k(natural number) <= 200
     **/
    public int[] reportResult(String[] id_list, String[] report, int k){
        // Preprocess
        // ReportedMap is ( reported, reporter array )
        HashMap<String, ArrayList<String>> reportedMap = new HashMap<>();
        HashMap<String, Integer> alarmMap = new HashMap<>();
        for(String id : id_list){
            ArrayList<String> reporter = new ArrayList<>();
            reportedMap.put(id, reporter);
            alarmMap.put(id, 0);
        }

        // Add reporter array.
        StringTokenizer st;
        String reporterId;
        String reportedId;
        ArrayList<String> reporterIdList;
        for(String reportCase : report){
            st = new StringTokenizer(reportCase);
            reporterId = st.nextToken();
            reportedId = st.nextToken();
            reporterIdList = reportedMap.get(reportedId);
            if(!reporterIdList.contains(reporterId)){
                reporterIdList.add(reporterId);
            }
        }

        // If reporter is more than k reporter get alarm.
        for(String key : reportedMap.keySet()){
            reporterIdList = reportedMap.get(key);
            if(reporterIdList.size() >= k){
                for(int i = 0; i < reporterIdList.size(); i++){
                    reporterId = reporterIdList.get(i);
                    alarmMap.put(reporterId, alarmMap.get(reporterId)+1);
                }
            }
        }

        // Get how many alarm would get in alarmMap.
        int[] result = new int[id_list.length];
        for(int i = 0; i < result.length; i++){
            result[i] = alarmMap.get(id_list[i]);
        }

        return result;
    }
}
