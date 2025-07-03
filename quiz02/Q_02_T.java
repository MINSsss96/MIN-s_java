package quiz02;

public class Q_02_T {
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

        int A = 0;
        int[] sum = new int[11];//2,3,4,5,6,7,8,9,10,11,12 ,12-2+
        double probability = 0;

        System.out.println("output : ");
        for (int i = 0; i < Q_02.COUNT; i++) {
            int dice_1 = (int) (Math.random() * 6) + 1;
            int dice_2 = (int) (Math.random() * 6) + 1;
            A = dice_1 + dice_2;


            for (int j = 0; j < sum.length; j++) {
                if (j == A-2) {
                    sum[j] = sum[j] + 1;
                }
            }

//            for (int  = 0;  < 11; j++) { // 0,1,2,3,4,5,6,7,8,9,10 10-0+1
//                sumB[j] = sumB[j] + 1;
//            }


//            if (A == 2) {
//                sum[0] = sum[0] + 1;
//            } else if (A == 3) {
//                sum[1] = sum[1] + 1;
//            } else if (A == 4) {
//                sum[2] = sum[2] + 1;
//            } else if (A == 5) {
//                sum[3] = sum[3] + 1;
//            } else if (A == 6) {
//                sum[4] = sum[4] + 1;
//            } else if (A == 7) {
//                sum[5] = sum[5] + 1;
//            } else if (A == 8) {
//                sum[6] = sum[6] + 1;
//            } else if (A == 9) {
//                sum[7] = sum[7] + 1;
//            } else if (A == 10) {
//                sum[8] = sum[8] + 1;
//            } else if (A == 11) {
//                sum[9] = sum[9] + 1;
//            } else {
//                sum[10] = sum[10] + 1;
//            }

        }
        for (int i = 0; i < sum.length; i++) {
            double rate = (double) sum[i] / Q_02_T.COUNT;

            String strRate = String.format("%7.6f", rate);
            System.out.println((i + 2) + " : " + sum[i] + "(" + strRate + ")");
        }


    }
}

