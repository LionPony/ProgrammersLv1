// 직사각형 별찍기
// https://school.programmers.co.kr/learn/courses/30/lessons/12969
package programmers.lv1;

import java.util.Scanner;

public class SquareStar {
    // Print square star by input.
    public void squareStar(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){
            for(int j = 0; j< a; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
