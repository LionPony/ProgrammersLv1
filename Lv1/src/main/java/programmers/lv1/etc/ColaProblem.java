// 콜라 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
package programmers.lv1.etc;

public class ColaProblem {
    /** If you give cola glasses you can get complimentary cola.
     * Figure out how many colas you would get.
     * n = Cola glasses at start
     * a = need for complimentary
     * b = colas given for complimentarty
     **/
    public int colaProblem(int a, int b, int n){
        return colaProblem(n, a, b, 0);
    }
    public int colaProblem(int count, int needed, int bonus, int leftover){
        if(count <= 0){
            return 0;
        }
        else{
            return bonus*((count+leftover)/needed) + colaProblem(bonus*((count+leftover)/needed), needed, bonus, (count+leftover)%needed);
        }
    }
}