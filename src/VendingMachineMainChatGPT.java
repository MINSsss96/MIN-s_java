
import javax.swing.*;
import java.util.Scanner;

public class VendingMachineMainChatGPT {
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
    static String menuChange = "";
    static int priceChange = 0;
    static int stockChange = 0;
    static int priceAdd = 0;
    static String menuAdd = "";
    static int stockAdd = 0;


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
                continue;
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
                    // 현재 선택한 제품의 가격과 재고 확인
                    int selectedIndex = menuChoice - 1;

                    // 잔액 부족 검사 먼저
                    if (money < price[selectedIndex]) {
                        System.out.println("잔액이 부족합니다!");
                        break; // case 1 빠져나가고, while문 반복됨
                    }

                    // 재고가 없을 경우 처리도 추가하면 좋음
                    if (stock[selectedIndex] <= 0) {
                        System.out.println("해당 상품은 품절입니다.");
                        break;
                    }


                    // 구매 처리
                    stock[selectedIndex] -= 1;
                    money -= price[selectedIndex];

                    System.out.println(product[selectedIndex] + "가 나왔다!");
                    System.out.println("잔액 : " + money);
                    break;

                case 2:
                    System.out.println("추가 금액을 입력하세요:");
                    int addedMoney = sc.nextInt();
                    money += addedMoney;
                    System.out.println("총 잔액: " + money);
                    break;

                case 3:
                    System.out.println("잔돈 " + money + "원을 반환합니다.");
                    money = 0;
                    break;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
            break;
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
                continue;
            } else if (menuChoice == 1004) {
                admin();

            } else {
                System.out.println("다시입력해주세요");
                continue;
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
        int total = 0;
        int sum = 0;
        for (int i = 0; i < COUNT; i++) {

            if (product[i] != null) {
                for (int j : stock) {
                    sales[j] = stock[j] * price[j];
                    sum += j;
                }
            }
        }
        System.out.println("현재까지의 수익은" + sum + "입니다");
    }

    private static void addMenu() {

        System.out.println("메뉴 추가 페이지");

        for (int i = 0; i < COUNT; i++) {
            if (product[i] == null) {
                System.out.println("추가하실 메뉴의 가격을 입력하세요");
                priceAdd = sc.nextInt();
                price[i] = priceAdd;
                System.out.println("추가하실 메뉴의 이름을 입력하세요");
                menuAdd = sc.next();
                product[i] = menuAdd;
                System.out.println(product[i] + "의 재고를 몇개 등록하시겠습니까?");
                stockAdd = sc.nextInt();
                stock[i] = stockAdd;
                break;
            } else {
                System.out.println("더이상 들어갈 자리가 없습니다!");
            }
        }
        System.out.println("메뉴 추가가 완료되었습니다!");
    }


    private static void updateStock() {
        System.out.println("재고 수정 페이지");
        System.out.println("재고를 추가하실 메뉴의 번호를 입력하세요" + 1 + " ~ " + COUNT);
        menuChoice = sc.nextInt();
        System.out.println(product[menuChoice - 1] + "을(를) 몇 개 추가하시겠습니까?");
        stockChange = sc.nextInt();
        stock[menuChoice - 1] = stock[menuChoice - 1] + stockChange;
        System.out.println("재고 추가가 완료되었습니다!");
    }

    private static void updateMenu() {
        System.out.println("메뉴 수정 페이지");
        System.out.println("====================");
        System.out.println("변경하실 메뉴의 번호를 입력하세요 : " + 1 + " ~ " + COUNT);
        menuChoice = sc.nextInt();

        System.out.println(product[menuChoice - 1] + "을(를) 무엇으로 바꾸시겠습니까?");
        menuChange = sc.next();
        product[menuChoice - 1] = menuChange;
        System.out.println(menuChange + "의 가격은 얼마입니까?");
        priceChange = sc.nextInt();
        price[menuChoice - 1] = priceChange;
        System.out.println(menuChange + "의 재고를 몇개 등록하시겠습니까?");
        stockChange = sc.nextInt();
        stock[menuChoice - 1] = stockChange;
        System.out.println("메뉴변경이 완료되었습니다!");
    }

    private static void updatePrice() {
        System.out.println("가격 수정 페이지");
        System.out.println("변경하실 메뉴의 번호를 입력하세요" + 1 + " ~ " + COUNT);
        menuChange = sc.next();
        System.out.println(product[menuChoice - 1] + "의 가격을 얼마로 바꾸시겠습니까?");
        priceChange = sc.nextInt();
        price[menuChoice - 1] = priceChange;
        System.out.println("가격 변경이 완료되었습니다!");
    }

}
