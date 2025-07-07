import java.util.Scanner;

public class vendingMachineV2Main {
    static Scanner sc = new Scanner(System.in);
    static int Choice = 0;
    static int coinChoice = 0;
    static int money = 0;
    static int addMoney = 0;
    static int coinInput = 0;
    static final int COUNT = 5;
    static String menuName = "";
    static String[] product = new String[COUNT];
    static int[] price = new int[COUNT];
    static int menuPrice = 0;
    static int[] stock = new int[COUNT];
    static int menuStock = 0;
    static String menuDelete = "";


    public static void main(String[] args) {

        mainMenu();
    }

    private static void mainMenu() {

        getInfo();


    }

    private static void getInfo() {

        while (true) {
            System.out.println("1. 동전투입 2. 잔돈 반환 3. 메뉴 선택 4. 관리자 메뉴 5. 종료 =>");
            Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                    coinInjection();
                    break;
                case 2:
                    coinReturn();
                    break;
                case 3:
                    menuChoice();
                    break;
                case 4:
                    admin();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }

        }
    }

    private static void admin() {
        while (true) {
            System.out.println("1. 메뉴 등록 2. 메뉴 삭제 3. 메뉴 수정 4. 재고 등록 5. 전체목록보기 6. 이전");
            adminMenu();
            continue;
        }
    }

    private static void adminMenu() {
        while (true) {
            int adminChoice = 0;
            adminChoice = sc.nextInt();
            boolean flag = false;

            switch (adminChoice) {
                case 1:
                    System.out.println("자판기 메뉴 등록");
                    System.out.println("제품 이름을 입력하세요");
                    menuName = sc.next();
                    System.out.println("제품의 가격은 ? (숫자만 입력)");
                    menuPrice = sc.nextInt();
                    System.out.println("재고 등록(채울 개수)");
                    menuStock = sc.nextInt();
                    for (int i = 0; i < COUNT; i++) {
                        if (product[i] == null) {
                            product[i] = menuName;
                            price[i] = menuPrice;
                            stock[i] = menuStock;
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }

                case 2:
                    for (int i = 0; i < COUNT; i++) {
                        if (product[i] == null) {
                            System.out.println("삭제할 메뉴가 없습니다.");
                            flag = true;
                            return;
                        } else if (product[i] != null) {
                            System.out.println("삭제할 제품명 입력 : ");
                            menuDelete = sc.next();
                            if (product[i] == menuDelete) {
                                product[i] = "";
                                flag = true;
                            }
                            System.out.println("삭제 완료");
                            return;
                        }
                    }
                    return;
                case 3:
                    System.out.println("수정 할 제품명 입력");
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;

            }

            System.out.println("============== 메뉴 ==============");
            for (int i = 0; i < COUNT; i++) {
                if (product[i] != null) {
                    System.out.println(" 제품명 : " + product[i] + " / 가격 : " + price[i] + " / 재고 개수 : " + stock[i]);
                }
            }
            System.out.println("=================================");
            return;
        }
    }

    private static void menuChoice() {
        System.out.println("현재 자판기에 상품이 없습니다.");
    }

    private static void coinReturn() {
        System.out.println(money + "원 반환 완료");
        money = 0;
        System.out.println("사용 가능 금액 " + money);
    }

    private static void coinInjection() {
        while (true) {
            System.out.println("돈을 넣어주세요.");
            System.out.println("1 : 5,000원 2: 1,000원 3: 500원 4: 100원");
            coinChoice = sc.nextInt();
            switch (coinChoice) {
                case 1:
                    addMoney = 5000;
                    break;
                case 2:
                    addMoney = 1000;
                    break;
                case 3:
                    addMoney = 500;
                    break;
                case 4:
                    addMoney = 100;
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }


            System.out.println("투입 금액 : " + addMoney);
            money += addMoney;
            System.out.println("사용 가능 금액 : " + money);

            return;
        }


    }

}
