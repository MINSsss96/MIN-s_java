package ch02;

import java.util.Scanner;

public class ConfirmGender2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호 뒷자리 첫 숫자를 입력하세요");
        int num = sc.nextInt();
        String gender = "";

        if (num < 1 || num > 5) {
            System.out.println("다시 입력해주세요");
        } else if (num == 5) {
            gender = " 외국인입니다.";
        } else if ((num % 2) == 1) {
            gender = "남자입니다.";
        } else {
            gender = "여자입니다.";
        }

        System.out.println(gender);


    }
}
