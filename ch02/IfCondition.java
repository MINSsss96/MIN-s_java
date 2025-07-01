package ch02;

import java.util.Scanner;

// 조건을 판단하고 처리할 때 사용하는 문법
public class IfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //이름 입력받기
        System.out.println("당신의 이름을 입력하세요 :");
        String name = sc.next();

        //성적 입력받기
        System.out.println(name + "님의 성적을 반드시 숫자로 입력하세요 : ");

        // 성적이 60점 이상이면 합격, 불합격
        // 스캐너로부터 성적 입력 받기
        int score = sc.nextInt();
        // 삼항연산
        System.out.println(score >= 60 ? "합격" : "불합격");

        // 삼항 연산
        // 조건 ? 참 : 거짓 ;
        // if 구문
        // if (조건) { 조건이 참일때 실행
        // } else{ 조건이 거짓일 때 실행
        // }

        // if (score >= 60) {
        // system.out.println("축하")
        // else{
        // system.out.println("다음기회에")
        // }

        //if 구문
        if (score >= 60) {
            System.out.println("축하합니다");
            // 만약에 75점을 입력 -> 15점을 더 획득했네요.
            System.out.println((score - 60) + "점을 더 획득했네요");
        } else {
            System.out.println("다음기회에");
            // 만약에 55점을 입력 -> 5점 부족해요.
            System.out.println((60 - score) + "점 부족해요");
        }




        // 만약에 너 점수가 90 이상이니?
        // 예, 아니오
        // 예 - 끝 A
        // 아니오 - 만약에 너 점수가 80 이상이니?
        // 예 - 끝 B
        // 아니오 -
        // .....
        // 아니오 - 만약에 너 점수가 60 이상이니?
        // 예 - D
        // 아니오 - F

    }
}
