// 개인정보 수집 유효기간
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
package programmers.lv1.etc;

import java.util.*;

public class Validation {
    /**
     * Find out which privacy is expired
     * @param today Today
     * @param terms Grade for validation.
     * @param privacies Date with valid grade.
     * @return Index of expired privacy array.
     */
    public int[] validation(String today, String[] terms, String[] privacies){
        // Preprocess.
        String[] todayArray = today.split("[.]");
        int nowYear = Integer.parseInt(todayArray[0]);
        int nowMonth = Integer.parseInt(todayArray[1]);
        int nowDate = Integer.parseInt(todayArray[2]);
        Date now = new Date(nowYear, nowMonth, nowDate);

        // Preprocess.
        HashMap<String, Integer> termsMap = new HashMap<>();
        for(String term : terms){
            String[] termArray = term.split(" ");
            termsMap.put(termArray[0], Integer.parseInt(termArray[1]));
        }

        // Make date object and compare validation.
        ArrayList<Integer> resultTemp = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++){
            String[] privacyArray = privacies[i].split(" ");

            todayArray = privacyArray[0].split("[.]");
            nowYear = Integer.parseInt(todayArray[0]);
            nowMonth = Integer.parseInt(todayArray[1]);
            nowDate = Integer.parseInt(todayArray[2]);
            Date privacyDate = new Date(nowYear, nowMonth, nowDate);

            privacyDate.monthPass(termsMap.get(privacyArray[1]));

            if(now.compareTo(privacyDate) > 0){
                resultTemp.add(i+1);
            }
        }

        // Make form to return.
        int[] result = new int[resultTemp.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = resultTemp.get(i);
        }
        return result;
    }
    public static class Date implements Comparable<Date> {
        int year;
        int month;
        int date;

        public Date(int year, int month, int date){
            this.year = year;
            this.month = month;
            this.date = date;
        }

        public void monthPass(int month){
            this.month += month;
            while(this.month > 12){
                this.year++;
                this.month -= 12;
            }
        }

        // Compare which one is older.
        @Override
        public int compareTo(Date other) {
            if(other.year > this.year){
                return -1;
            }
            else if (other.year < this.year) {
                return 1;
            }
            else{
                if(other.month > this.month){
                    return -1;
                }
                else if (other.month < this.month) {
                    return 1;
                }
                else{
                    if(other.date > this.date){
                        return -1;
                    }
                    else if (other.date < this.date) {
                        return 1;
                    }
                    else{
                        return 1;
                    }
                }
            }
        }
    }
}
