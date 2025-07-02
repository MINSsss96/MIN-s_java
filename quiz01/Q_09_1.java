package quiz01;

import java.util.Scanner;

public class Q_09_1 {
    //문제 9. 별찍기
    //
    //- 문제
    //첫째 줄에는 별 5개, 둘째 줄에는 별 4개 .... 마지막 1개
    //
    //- 입력
    //정수로 출력할 줄 수를 입력받는다.
    //
    //- 출력
    //첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
    //
    //- 예제입력
    //5
    //
    //- 예제출력
    //*****
    //****
    //***
    //**
    //*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력하세요");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            String A = "";
            for (int j = 0; j < n-i; j++) {
                A = A+ "*" ;
            }
            System.out.println(A);
        }

    }
}
