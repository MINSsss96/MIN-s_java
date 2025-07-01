package quiz01;

public class Q_05 {
    //문제5. money 변수 3780원의 금액이 있습니다.
    //  이를 다음과 같은 결과가 나오도록 출력합니다.
    //
    //
    //1000원 : 3개
    //남은금액 : 780원
    //500원 : 1개
    //남은금액 : 280원
    //100원 : 2개
    //남은금액 : 80원
    //10원 : 8개
    //남은금액 : 0원

    static int restMoneyPrint(int restMoney, int rest) {
        System.out.println(rest +"원 : "  + (restMoney / rest) + "개" );
        restMoney = restMoney % rest;
        System.out.println("남은금액 : " + restMoney);
        return restMoney;
    }

    public static void main(String[] args) {

        int money = 3780;
        int restMoney = money;

       restMoney = restMoneyPrint(restMoney, 1000);
       restMoney = restMoneyPrint(restMoney, 500);
       restMoney = restMoneyPrint(restMoney, 100);
       restMoney = restMoneyPrint(restMoney, 10);

    }




}
