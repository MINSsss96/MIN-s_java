package main;

import view.ViewProcess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ViewProcess viewProcess = new ViewProcess();

        while (true) {
            System.out.println("소속사 정보");
            // 서비스에서 소속사 정보 가져오기
            // 뷰 기능 호출하기
            System.out.println("소속 그룹 정보를 보려면 번호를 ID 입력, 종료는 0");
            viewProcess.getEntertainment();
            int num = sc.nextInt();
            if (num == 0) {
                return;
            } else {
                // 서비스에서 해당 소속사의 그룹 정보 가져오기
                // 뷰 기능 호출하기
                viewProcess.findByEnterId(num);
            }
        }
    }
}
