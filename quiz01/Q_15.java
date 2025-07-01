package quiz01;

import java.util.Scanner;

public class Q_15 {
    //문제 15. 다음을 구현하세요.
    //
    //
    //처음 프로그램이 시작되면....
    //
    //======================
    //메뉴를 선택하세요
    //======================
    //1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기
    //
    //각 번호를 선택하면..
    //
    //안녕하세요
    //삐끼삐끼 춤입니다.
    //맛나게 먹었습니다.
    //프로그램을 종료합니다.
    //
    //1~3번을 선택하면 해당 메시지를 보여주고
    //다시 메뉴선택화면을 보여줍니다.
    //
    //4번을 선택하면 메시지를 출력하고 멈춥니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        do {                System.out.println("===============");
            System.out.println("메뉴를 선택하세요");
            System.out.println("===============");
            System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기 4. 종료하기");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("안녕하세요");
                    break;
                case 2:
                    System.out.println("삐끼삐끼 춤입니다.");
                    break;
                case 3:
                    System.out.println("맛나게 먹었습니다.");
                    break;
                default:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        } while (true);

    }

}


