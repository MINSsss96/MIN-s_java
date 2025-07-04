import java.util.Scanner;

public class MegaCoffeeManagerKms {
    //공동 스캐너 만들기
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        while (true) {
            // 메인 메뉴를 보여주는 함수
            mainmenu();
            return;
        }


    }

    private static void mainmenu() {
        while (true) {
            System.out.println("메가 커피에요");
            System.out.println("무엇을 도와드릴까요?");
            System.out.println("1. 주문하기 2. 관리자 3. 종료하기");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    order();
                    break;
                case 2:
                    admin();
                    break;
                case 3:
                    //메인 함수로 돌아가기
                    return;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }

    private static void admin() {
        //비밀번호 확인
        while (true) {
            System.out.println("관리자 화면");
            System.out.println("1. 메뉴 가격 수정하기 2. 메뉴 추가하기 3. 정산하기 4. 돌아가기");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    menuUpdate();
                    break;
                case 2:
                    menuInsert();
                    break;
                case 3:
                    menuResult();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못 입력했어요.");
            }
        }

    }

    private static void menuResult() {
        System.out.println("3. 정산하기 ");
    }

    private static void menuInsert() {
        System.out.println("2. 메뉴 추가하기 ");
    }

    private static void menuUpdate() {
        System.out.println("1. 메뉴 가격 수정하기");
    }


    // 사용자 메뉴 보이기
    private static void order() {

        System.out.println("메가 커피 메뉴");
        System.out.println("1. 아메리카노 1800");
        System.out.println("0. 돌아가기");
        System.out.println("주문할 번호를 입력하세요.");
        int orderNumber = sc.nextInt();
        switch (orderNumber) {
            case 1:
                System.out.println("주문이 완료되었습니다.");
                break;
            case 0:
                System.out.println("메인으로 돌아갑니다.");
                return;
            default:
                System.out.println("잘못 입력했어요.");
        }

    }
}
