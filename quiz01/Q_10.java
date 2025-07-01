package quiz01;

import java.util.Scanner;

public class Q_10 {
    //문제 10. 입력받은 구구단 출력하기
    //
    //- 문제
    //화면에서 입력받은 수의 구구단 출력.
    //
    //- 입력
    //구하고자 하는 구구단의 수를 입력받는다.
    //N(2 ≤ N ≤ 9)이 주어진다.
    //
    //- 출력
    //해당 구구단을 출력한다.
    //
    //- 입력
    //3
    //
    //- 예제출력
    //3 × 1 = 3
    //3 × 2 = 6
    //3 × 3 = 9
    //3 × 4 = 12
    //....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("수를 입력하세요");
        int N = sc.nextInt();

        if (N < 2) {
            N = 2;
        }
        if (N > 9) {
            N = 9;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " X " + i + " = " + (N * i));

        }
    }
}
