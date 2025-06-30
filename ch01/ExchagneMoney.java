package ch01;

public class ExchagneMoney {
    // 2,680원을 1,000원 , 500원, 100원, 50원, 10원
    // 각각 몇 개씩 최소로 필요한지 출력하세요
    // 금액 : 2,680원
    // 1,000원 : 2개
    // 500원 : 1개
    // 100원 : 1개
    // 50원 : 1개
    // 10원 : 3개

    public static void main(String[] args) {
//        int a = 2680;
//        int result;

//------------------------------------------------내가 한 것
//        int A = (a / 1000);
//        System.out.println("1000원 : " + A); // 몫 2
//        result = a % 1000;  // 나머지 680
//
//        int B = result / 500;  // 680/500 의 몫 1
//        System.out.println("500원 : " + B);
//        result = result % 500; // 680/500 의 나머지 180
//
//        int C = result / 100; // 180/100 의 몫 1
//        System.out.println("100원 : " + C);
//        result = result % 100; // 180/100의 나머지 80
//
//        int D = result / 50; // 80/50 의 몫 1
//        System.out.println("50원 : " + D);
//        result = result % 50; // 80/ 50 의 나머지 30
//
//        int E = result / 10; // 30/10 의 몫 3
//        System.out.println("10원 : " + E);
//----------------------------------------------- 선생님이 한 것
        int coin = 2680; // 초기 금액을 저장
        int restCoin = coin;


        // 함수의 필요성 - 반복적인 작업을 따로 분리 -> 함수를 호출하면 실행
        // 함수 만드는 법
        // 반환할 타입 함수이름(전달할 값)


        System.out.println("바꿀 돈 : " + coin);

        //1. 1000원의 갯수 : 몫 구하기
//        System.out.println("1000원 개수 :" + (coin / 1000));
        //2. 1000원 갯수를 뺀 나머지를 구해야함
//        restCoin = coin % 1000;
       restCoin = restCoinPrint(restCoin, 1000);
       // System.out.println("잔액 : " + restCoin);

        //3. 500원의 갯수 : 몫 구하기
//        System.out.println("500원 개수 :" + (restCoin / 500));
        //4. 500원 갯수를 뺀 나머지를 구해야함
//        restCoin = coin % 500;
        restCoin = restCoinPrint(restCoin, 500);
        //System.out.println("잔액 : " + restCoin);

        //5. 100원의 갯수 : 몫 구하기
//        System.out.println("1000원 개수 :" + (restCoin / 100));
        //6. 100원 갯수를 뺀 나머지를 구해야함
//        restCoin = coin % 100;
        restCoin = restCoinPrint(restCoin, 100);
       // System.out.println("잔액 : " + restCoin);

        //7. 50원의 갯수 : 몫 구하기
//        System.out.println("10원 개수 :" + (restCoin / 50));
        //8. 50원 갯수를 뺀 나머지를 구해야함
//        restCoin = coin % 50;
        restCoin =restCoinPrint(restCoin, 50);
       // System.out.println("잔액 : " + restCoin);


        //9. 10원의 갯수 : 몫 구하기
//        System.out.println("10원 개수 :" + (restCoin / 10));
        //10. 10원 갯수를 뺀 나머지를 구해야함
//        restCoin = coin % 10;
        restCoin = restCoinPrint(restCoin, 10);
//        System.out.println("잔액 : " + restCoin);
        // 잔액을 출력하는 함수를 호출



    }

    //잔액을 출력하는 함수
    static int restCoinPrint (int restCoin, int don){
        System.out.println(don + "원 개수 :" + (restCoin / don));
        restCoin = restCoin % don;
        System.out.println("잔액 : " + restCoin);
        return restCoin;
    }

}
