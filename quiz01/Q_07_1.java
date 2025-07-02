package quiz01;

import java.util.Scanner;

public class Q_07_1 {
    //문제7. 두 정수 A와 B를 차례로 입력받은 다음, 두 수 A와 B 사이의 모든 정수값을 더해
    // 출력하는 프로그램을 작성하시오.
    //
    //- 예제 입력 1
    //첫 번째 값을 입력하세요 :
    //2
    //두 번째 값을 입력하세요 :
    //7
    //
    //- 예제 입력
    //첫 번째 값을 입력하세요 :
    //7
    //두 번째 값을 입력하세요 :
    //2
    //
    //- 출력
    //27
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int temp;
        int sum = 0;

        System.out.println("첫 번째 값을 입력하세요");
        int A = sc.nextInt();
        System.out.println("두 번째 값을 입력하세요");
        int B = sc.nextInt();


        if (A < B) {
            temp = B;
            B = A;
            A = temp;
        }

        for (int i = B; i <= A; i++) {
            sum = sum + i;
        }

        System.out.println(sum);


    }
}
