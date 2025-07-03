package quiz02;

import java.awt.*;

public class Q_02 {
    //문제 2.
    //
    //주사위 두 개를 36,000번 던져서 나오는 모든 경우의 수를 계산하는 프로그램을 작성하세요.
    //주사위 각각은 1부터 6까지의 정수값을 표시할 수 있으므로 합계는 2부터 12까지입니다.
    //
    //- 입력 : 없음.
    //
    //- 출력
    //아래의 모양과 유사하게 출력되도록 합니다.
    //
    //Output :
    //2 : 1026 (0.028500)
    //3 : 2023 (0.056193)
    //4 : 2988 (0.083000)
    //5 : 4086 (0.113500)
    //6 : 5018 (0.139389)
    //7 : 5978 (0.166056)
    //8 : 4928 (0.136889)
    //9 : 3992 (0.110889)
    //10 : 3096 (0.086000)
    //11 : 1907 (0.052972)
    //12 : 958 (0.026611)

    final static int COUNT = 36000;

    public static void main(String[] args) {

        int[] dice = new int[11];//2,3,4,5,6,7,8,9,10,11,12 ,12-2+


        for (int i = 1; i < Q_02.COUNT; i++) {
            int dice_1 = (int) (Math.random() * 6) + 1;
            int dice_2 = (int) (Math.random() * 6) + 1;
            int sum = dice_1 + dice_2;
            dice[sum - 2]++;
        }
        //결과 출력
        System.out.println("output : ");
        for (int i = 0; i < dice.length; i++) {
            double rate = (double) dice[i] / Q_02_T.COUNT;

            String strRate = String.format("%7.6f", rate);
            System.out.println((i + 2) + " : " + dice[i] + "(" + strRate + ")");


        }
    }
}
