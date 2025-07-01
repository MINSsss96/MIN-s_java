package quiz01;

public class Q_03 {
    //문제3. 1부터 20까지의 수를 출력하세요. (단, 2의 배수일 때만 출력하세요)
    //      for 문법 사용
    public static void main(String[] args) {

        int i =1;
        for (i = 2 * i; i <= 20; i = i + 2) {
            System.out.println(i);
        }

    }

}
