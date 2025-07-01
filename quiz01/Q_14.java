package quiz01;

import java.util.Scanner;

public class Q_14 {
    //문제 14. 주사위 세개
    //
    //- 문제
    //1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라
    //상금을 받는 게임이 있다.
    //
    //ⓐ 같은 눈이 3개가 나오면
    //    -- 상금 : 10,000원 + (같은 눈) × 1,000원
    //ⓑ 같은 눈이 2개만 나오는 경우에는
    //    -- 상금 : 1,000원 + (같은 눈) × 100원
    //ⓒ 모두 다른 눈이 나오는 경우에는
    //    -- 상금 : (그 중 가장 큰 눈) × 100원
    //
    //예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000 + 3 × 100으로 계산되어
    //    1,300원을 받게 된다.
    //또 3개의 눈이 2, 2, 2로 주어지면 10,000 + 2 × 1,000 으로 계산되어
    //    12,000원을 받게 된다.
    //3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6 × 100으로 계산되어
    //    600원을 상금으로 받게 된다.
    //
    //3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
    //
    //- 3개 주사위 값을 순서대로 입력받는다.
    //
    //- 출력
    //첫째 줄에 게임의 상금을 출력 한다.
    //
    //- 예제입력
    //3 3 6
    //
    //2 2 2
    //
    //6 2 5
    //
    //- 예제출력
    //1300
    //
    //12000
    //
    //600

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
        System.out.println("3개의 주사위 값을 순서대로 넣으세요");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

            if (A < 1 || A > 6) {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
            if (B < 1 || B > 6) {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
            if (C < 1 || C > 6) {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }

        int max;

        if (A > B && A > C) {
            max = A;
        } else if (B > A && B > C) {
            max = B;
        } else{
            max = C;
        }


            if (A == B && A == C) {
                System.out.println(10000 + A * 1000);
            } else if (A == B || A == C) {
                System.out.println(1000 + A * 100);
            } else if (B == A || B == C) {
                System.out.println(1000 + B * 100);
            }else if (C==A || C == B){
                    System.out.println(1000 + C * 100);
            } else {
            System.out.println(max * 100);
        }return;

        } while (true);


    }
}
