package ch01;
//두 수를 바꾸는 것

public class BasicJava {
    public static void main(String[] args) {
        // 두 수 a, b를 바꾸려면
        // 빈 변수(정수)를 하나 만든다. => temp : 비어 있다는 뜻
        // 0. 바꾸기 전 a와 b를 출력해 본다.
        // 1. a를 temp에 넣는다.
        // 2. b를 a에 넣는다.
        // 3. temp를 b에 넣는다.
        // 4. 바꾼 이 후 a와 b를 출력해 본다.
        //------------
        // a 와 b 변수를 선언하고, 초기 값을 준다.


        int a = 10;
        int b = 20;
        int temp ;
        // 바꾸기 전 a, b를 출력
        System.out.println("A의 값은  " + a + ",B의 값은 " + b);
System.out.println("문자");
        //두 수 a,b를 바꾸는 작업을 합니다.


        temp = a; // a 값을 temp에 할당한다
        a = b; // b 값을 a에 할당한다
        b = temp;
        //두 수를 바꾼 후 출력
        System.out.println("a = " +a +  ", b = " +b );

    }
}