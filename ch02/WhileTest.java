package ch02;

public class WhileTest {
    public static void main(String[] args) {
        //1 ~ 10 까지 더하는 과정을
        //while 구문으로 표기
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);

        //초기화
        sum = 0;
        i = 1;

        do {
            sum = sum + i;
            i = i + 1;
        } while (i <=10);
        System.out.println(sum);

    }

}
