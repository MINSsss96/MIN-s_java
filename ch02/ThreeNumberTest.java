package ch02;

import java.util.Scanner;

public class ThreeNumberTest {
    // 세 수를 차례로 입력 받습니다.
    // 가장 큰 수와 가장 작은 수를 출력합니다.

//    //위에 적은 스캐너는 공요으로 사용하기 위해서 위에 적는다
//    static Scanner = new Scanner(System.in);



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        System.out.println("세 번째 숫자를 입력해주세요");
        int num3 = sc.nextInt();

        int max;
        int min;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println(" 가장 큰 숫자 : " + max);

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min =  num3;
        }

        System.out.println(" 가장 작은 숫자 : " + min);

//        // ---- 선생님이 하신 것
//        int a;
//        int b;
//        int c;
//        int maxValue = Integer.MIN_VALUE;
//        int minValue = Integer.MAX_VALUE;
//        System.out.println("세 수를 차례로 입력하세요");
//        // 처음 입력값을 maxvalue 와 minvalue에 넣어준다
//        a = sc.nextInt();
//        // 두번재 수를 a에 입력받는다.
//        b = sc.nextInt();
//        // 세번째 수를 b에 입력받는다
//        c = sc.nextInt();
//
//        // a와 b를 비교해서 큰 수는 maxValue
//        // 작은 수는 minValue에 넣는다.
//        if (a > b) {
//            maxValue = a;
//            minValue = b;
//        } else {
//            maxValue = b;
//            minValue = a;
//        }
//
//
//        // c가 minValue 보다 작으면 c -> minValue
//        if (c > maxValue) {
//            maxValue = c;
//        }
//        //c가 minValue 보다 작으면 c=> MinValue
//        if (c < minValue) {
//            minValue = c;
//        }
//
//        System.out.println("max" + maxValue);
//        System.out.println("min" + minValue);
//
//


    }
}

