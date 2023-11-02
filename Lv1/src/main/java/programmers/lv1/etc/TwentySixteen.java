// 2016년
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
package programmers.lv1.etc;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TwentySixteen {
    int year = 2016;
    String[] week = new String[]{"MON","TUE","WED","THU","FRI","SAT", "SUN"};
    public String twentySixteen(int a, int b){
        LocalDate date = LocalDate.of(this.year, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return week[dayOfWeek.ordinal()];
    }
}
