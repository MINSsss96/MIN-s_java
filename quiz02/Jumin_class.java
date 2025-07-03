package quiz02;
//#※ 주민번호 처리 알고리즘
//
//ⓐ 주민번호 13자리 중 맨 마지막 자리를 제외한 각각의 자리에 2,3,4,5,6,7,8,9,2(9번째 숫자),3,4,5를 곱해서 더한다
//                                                   9,6,0,6,0,7,1,2,3           ,4,1,2
//ⓑ 그 값을 11로 나눈 나머지를 취한다. (mod)
//
//ⓒ 그 값을 11에서 뺀다.
//
//ⓓ 다시 10으로 나눈 나머지를 취한다.
//
//ⓔ 마지막 값과 같으면 올바른 주민번호
//
//배열에 13자리 주민번호를 넣고, 해당 알고리즘 수행 후
//
//맞는 주민번호이면 “올바른 주민번호입니다.” 출력
//틀린 주민번호이면 “잘못된 주민번호입니다.” 출력        nums[0] = nums[0] +5;

import java.util.Scanner;

public class Jumin_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 13자리를 입력해주세요");
        String numbers = sc.next();
        String[] strJuminNum = numbers.split("");
        int[] juminNum = new int[strJuminNum.length];

        int x = 1;
        int sum = 0;


        for (int i = 0; i < numbers.length() - 1; i++) {
            juminNum[i] = Integer.parseInt(strJuminNum[i]);
            if (x >= 9) {
                x = x - 8;
            }

            x= x + 1;
            juminNum[i] = juminNum[i] * x;

            System.out.println(juminNum[i]);


        }
        sum = sum % 11;
        sum = 11 - sum;
        sum = sum % 10;
        System.out.println(sum);

        for (int j = 0; j < numbers.length(); j++) {
            juminNum[j] = Integer.parseInt(strJuminNum[j]);
        }
        if (juminNum[12] == sum) {
            System.out.println("올바른 주민번호입니다.");
        } else {
            System.out.println("잘못된 주민번호 입니다.");
        }

    }


}
