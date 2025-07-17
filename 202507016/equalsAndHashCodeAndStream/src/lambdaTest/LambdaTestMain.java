package lambdaTest;

public class LambdaTestMain {
    public static void main(String[] args) {
        // 중괄호 쓰려면 return 을 무조건 써야함

        Calc add = (x, y) -> {
            return x + y;
        };

        // 한줄이면 return 안써도 됨
        Calc minus = (x, y) -> x - y;


        System.out.println(add.calc(3, 5));
        System.out.println(minus.calc(3, 5));
    }
}
