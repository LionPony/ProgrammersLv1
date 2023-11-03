// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
package programmers.lv1.etc;

public class Paint {
    /**
     * Find the minimal brush to paint fence.
     * 1<= m <= n <= 100,000
     * 1 <= section.length <= n
     */
    public int paint(int n, int m, int[] section){
        boolean[] fence = new boolean[n];
        for(int i : section){
            fence[i-1] = true;
        }

        int brushCount = 0;
        while(isRemain(fence)){
            for(int i = 0; i < fence.length; i++){
                if(fence[i]){
                    brush(fence, i, m);
                    brushCount++;
                }
            }
        }

        return brushCount;
    }
    public boolean isRemain(boolean[] fense){
        for(boolean i : fense){
            if(i){
                return true;
            }
        }
        return false;
    }
    public void brush(boolean[] fence, int start, int m){
        int goal = start+m-1;
        if(goal > fence.length-1){
            goal = fence.length-1;
        }

        for(int i = start; i <= goal; i++){
            fence[i] = false;
        }
    }
}
