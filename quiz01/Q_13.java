package quiz01;

import java.util.Scanner;

public class Q_13 {
    //문제 13. 오븐시계
    //
    //- 문제
    //KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을
    //개발하려고 한다.
    //인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
    //그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
    //
    //또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을
    //알려 주는 디지털 시계가 있다.
    //
    //훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
    //오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
    //
    //- 입력
    //첫째 입력 값은 현재 시간,(0 ≤ A ≤ 23)
    //두번째 입력 값은 현재 분, (0 ≤ B ≤ 59)
    //세번째 입력값은 요리하는 데 필요한 시간
    //	C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
    //
    //- 출력
    //첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
    //(단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
    //디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
    //
    //- 예제입력
    //14
    //30
    //20
    //
    //17
    //40
    //80
    //
    //23
    //48
    //25
    //
    //- 예제출력
    //14 50
    //
    //19 0
    //
    //0 13

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("현재 시간을 입력하시오");
            int H = sc.nextInt();
            System.out.println("현재 분을 입력하시오");
            int M = sc.nextInt();
            System.out.println("필요한 시간을 입력하시오");
            int C = sc.nextInt();

            if (H < 0 || H > 24) {
                System.out.println("다시입력해주세요");
                continue;
            }
            if (M < 0 || M > 60) {
                System.out.println("다시입력해주세요");
                continue;
            }
            if (C < 0 || C > 1000) {
                System.out.println("다시입력해주세요");
                continue;
            }

            if (C > 60) {
                M = M + C % 60;
                H = H + C / 60;
            } else {
                M = M + C;
            }

            if (M >= 60) {
                M = M % 60;
                H = H + 1;
            }

            if (H >= 24) {
                H = H % 24;
            }
            System.out.println(H + " " + M);
            return;

        } while (true);

        }
    }
