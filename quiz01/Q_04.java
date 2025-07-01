package quiz01;

import java.util.Scanner;

public class Q_04 {
    //문제4. 임의의 값 n이 주어지면
    //   예를들어 n=5이면
    //   1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
    //   의 결과를 출력하세요.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("n 값을 입력해주세요");
        int n =sc.nextInt();
        int i;
        int j;
        int sum = 0;


            for (i = 1; i <= n ; i++) {

                for (j = 1; j <= i; j++) {
                    sum= sum + j;
                }
            }


            System.out.println(sum);


    }
}
