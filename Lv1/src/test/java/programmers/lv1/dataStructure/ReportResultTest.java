// 신고 결과 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;
import programmers.lv1.dataStructure.ReportResult;

public class ReportResultTest {
    /** Count how many report result will user get.
     * report arry is set of A report B
     * If someone who reported k over reporter would get alarm.
     * 2 <= id_list <= 1000, 1<= report <= 200,000, 1 <= k(natural number) <= 200
     **/
    @Test
    public void reportResult1() {
        ReportResult reportResult = new ReportResult();
        Assert.assertArrayEquals(new int[]{0,0}, reportResult.reportResult(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3));
    }
    @Test
    public void reportResult() {
        ReportResult reportResult = new ReportResult();
        Assert.assertArrayEquals(new int[]{2, 1, 1, 0}, reportResult.reportResult(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2));
    }
}