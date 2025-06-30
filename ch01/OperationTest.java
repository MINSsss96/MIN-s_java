package ch01;

public class OperationTest {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int sum = n1 + n2;
        System.out.println(sum);

        String s1 = "반가워요 나의 나이는 ";
        int age = 20;
        String s2 = "살 이에요";
        String s3 = s1 + age + s2;

//      반가워요 나의 나이는 20살 이에요
        System.out.println(s3);


//        // n1 = 0으로 나눈 결과를 출력해 보세요
//        System.out.println(n1 / 0);

        //비교연산자
        // > , < , >= , <= ,== , !=
        //논리연산자
        // && (and), || (or) , ! (not)
        //비교판단 ---if

        //비교연산과 논리연산의 결과는 항상 논리값이다.
        boolean trueOrFalse;
        trueOrFalse = (1 == 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 != 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 >= 2);
        System.out.println(trueOrFalse);

        // x 라는 int 변수가 있어요
        // x 가 1 ~ 10 사이의 값이면 , true 그렇지 않으면 false

        int x = 9;
        trueOrFalse = (x >= 1 && x <= 10);
        System.out.println(trueOrFalse);

        trueOrFalse = (x >= 1 || x <= 10);
        System.out.println(trueOrFalse);

        System.out.println("============");

        // 문자열 비교
        String grade = "VIP";
        String myGrade = "일반";
        trueOrFalse = grade == myGrade;
        trueOrFalse = grade.equals("일반");
        System.out.println(trueOrFalse);



    }
}
