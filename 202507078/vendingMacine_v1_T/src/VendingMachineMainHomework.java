import javax.swing.*;
import java.util.Scanner;

public class VendingMachineMainHomework {
    //전체적으로 자주 사용하는 변수와 배열을 선언
    public static Scanner sc = new Scanner(System.in);
    // 전체 제품 수
    static final int COUNT = 5;

    static String[] product = new String[COUNT]; // 제품명
    static int[] price = new int[COUNT]; // 단가
    static int[] stock = new int[COUNT]; // 재고 수량
    static int[] sales = new int[COUNT];
    static int money = 0;
    static int menuChoice = 0;

    private static void dataInitialize() {
        product[0] = "coke";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "cyder";
        price[1] = 700;
        stock[1] = 3;

        product[2] = "coffee";
        price[2] = 1500;
        stock[2] = 3;
    }

    public static void main(String[] args) {
        //데이터 초기화 함수 호출하기

        dataInitialize();
        mainMenu();

    }

    private static void mainMenu() {
        while (true) {
            // 제품정보 얻어오기
            getinfo();
            System.out.println("돈을 넣어주세요 : ");

            money = sc.nextInt();
            // 1004 인 경우 관리자 메뉴로 갑니다.
            if (money == 1004) {
                admin();
                break;
            } else if (money < 500) {
                System.out.println("금액이 부족합니다.");
                continue;
            } else {
                userMenu();
                break;
            }


        }
    }

    private static void userMenu2() {
        while (true) {
            System.out.println("1.계속 구매하기 2.금액 추가하기 3.잔돈반환하기");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < COUNT; i++) {
                        if (menuChoice - 1 == i) {
                            stock[i] = stock[i] - 1;
                        }
                    }
                    for (int j = 0; j < COUNT; j++) {
                        if (menuChoice - 1 == j) {
                            if (money < price[j]) {
                                System.out.println("잔액이 부족합니다!");
                            }
                        }

                    }


                    getinfo();


                    System.out.println("돈을 넣어주세요 : " + money);
                    System.out.println("메뉴 입력 : " + menuChoice);
                    for (int i = 0; i < COUNT; i++) {
                        if (menuChoice - 1 == i) {
                            System.out.println(product[i] + "가 나왔다!");
                            money = money - price[i];
                            System.out.println("잔액 : " + money);
                            break;
                        }

                    }

                    break;


                case 2:
                    System.out.println("금액이 추가되었습니다!" + "잔액 : " + money);
                    break;
                case 3:
                    System.out.println("거스름 돈" + money + "원이 반환 됩니다.");
                    System.out.println("감사합니다! 다음에 또 이용해주세요!!");
                    break;

                default:
                    System.out.println("다시 입력해주세요");
                    return;
            }
        }

    }

    private static void getinfo() {
        System.out.println("===========================");
        System.out.println("자판기입니다.(번호 : 상품(가격) - 재고");
        for (int i = 0; i < COUNT; i++) {
            if (product[i] != null) {
                String strMenu = (i + 1) + "." + product[i] + " : " + price[i] + "원 " + "-" + stock[i] + "개";
                System.out.println(strMenu);
            }



        }
        System.out.println("===========================");

    }

    private static void userMenu() {
        while (true) {
            getinfo();
            System.out.println("돈을 넣어주세요 : " + money);
            System.out.println("메뉴 입력 : ");
            menuChoice = sc.nextInt();
            if (menuChoice >= 1 && menuChoice <= 3) {
                userMenu2();
                break;
            } else {
                System.out.println("다시입력해주세요");
                break;
            }
        }
    }

    private static void admin() {
        while (true) {
            System.out.println("관리자 페이지 입니다.");
            System.out.println("1. 메뉴변경 2. 가격변경 3. 재고추가 4. 메뉴추가 5. 수익확인(종료는-1)");
            System.out.println("번호를 입력하세요 :");
            int choice = sc.nextInt();
            switch (choice) {
                case -1: // 종료
                    System.out.println("메인으로 돌아가요");
                    return;
                case 1: //메뉴 변경
                    updateMenu();
                    break;
                case 2: //가격 변경
                    updatePrice();
                    break;
                case 3: //재고 추가
                    updateStock();
                    break;
                case 4: //메뉴 추가
                    addMenu();
                    break;
                case 5: //수익 확인
                    salesConfirm();
                    break;
                default:
                    System.out.println("잘못 입력했어요");
                    continue;
            }

        }
    }

    private static void salesConfirm() {
        System.out.println("매출 확인 페이지");
    }

    private static void addMenu() {
        System.out.println("메뉴 추가 페이지");
    }

    private static void updateStock() {
        System.out.println("재고 수정 페이지");
    }

    private static void updateMenu() {
        System.out.println("가격 수정 페이지");
    }

    private static void updatePrice() {
        System.out.println("메뉴 수정 페이지");
    }

}
