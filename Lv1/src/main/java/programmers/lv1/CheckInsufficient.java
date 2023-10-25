// 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
package programmers.lv1;

public class CheckInsufficient {
    // Try to find out how much insufficient to pay.
    // After you use it. Price goes n times.
    // 1<=price<2,500 / 1<=money<=1,000,000,000 / 1<=count<=2,500
    public long checkInsufficient(int price, int money, int count){
        // Exception for overflow.
        long priceLong = price;
        // Arithmetic sequence
        long need = (count * (priceLong + count*priceLong)) / 2;
        if(money > need){
            return 0;
        }
        return need-money;
    }
}