package ch02;

public class FOrEx01 {
    public static void main(String[] args) {

        // 1부터 5까지 더해서 출력하는 프로그램
        int sum = 0; //누적할 변수

        for (int i = 1; i < 6; i = i + 1) {
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
