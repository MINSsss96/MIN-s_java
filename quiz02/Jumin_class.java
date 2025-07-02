package quiz02;
//#※ 주민번호 처리 알고리즘
//
//ⓐ 주민번호 14자리 중 맨 마지막 자리를 제외한 각각의 자리에 2,3,4,5,6,7,8,9,2(9번째 숫자),3,4,5를 곱해서 더한다
//
//ⓑ 그 값을 11로 나눈 나머지를 취한다. (mod)
//
//ⓒ 그 값을 11에서 뺀다.
//
//ⓓ 다시 10으로 나눈 나머지를 취한다.
//
//ⓔ 마지막 값과 같으면 올바른 주민번호
//
//배열에 14자리 주민번호를 넣고, 해당 알고리즘 수행 후
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

        int sum = 1;

        for (int i = 0; i < numbers.length()-1; i++) {
            juminNum[i] = juminNum[i] * (sum = sum + i);
            if (sum > 9) {
                sum = sum / 9 + 1;
            }
        }
        System.out.println(sum);





    }
}
