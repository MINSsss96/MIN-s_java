package ch02;

import java.util.Scanner;

public class ConfirmGender {

    // 주민번호 뒷자리 첫 숫자를 입력하세요
    // 1 또는 3 이면 : 남자
    // 2 또는 4 이면 : 여자
    // 5 이면 : 외국인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호 뒷자리 첫 숫자를 입력하세요");
        int num = sc.nextInt();
        String gender;


        if (num == 1 || num == 3) {
            gender = "남자입니다.";
        } else if (num == 2 || num == 4) {
            gender = "여자입니다.";
        } else if (num == 5) {
            gender = "외국인 입니다.";
        } else {
            gender = "다시 입력해주세요";
        }


        System.out.println(gender);

           //---------- 선생님이 하신 것 1
//        System.out.println("주민번호 뒷자리 첫 숫자를 입력하세요");
//        // 주민번호 뒷자리 첫 숫자를 입력받습니다.
//        int num = sc.nextInt();
//        String reslut;
//       // 비교를 해야....
//        if (num == 1 || num == 3) {
//            reslut = "남";
//        } else if (num == 2 || num == 4) {
//            reslut = "여";
//        } else if (num == 5) {
//            reslut = "외국인";
//        } else {
//            reslut = "다시 입력해주세요";
//        }







    }
}
