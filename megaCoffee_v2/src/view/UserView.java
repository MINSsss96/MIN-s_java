package view;

import main.CoffeeMain;
import service.UserService;

import java.util.Scanner;

public class UserView {
    // UserService 사용하도록 생성
    private UserService userService = new UserService();
    private Scanner sc = new Scanner(System.in);

    public void userScreen() {
        System.out.println("고객화면");
        System.out.println("============================");
        System.out.println("주문할 번호를 입력하세요.");
        viewMenu();
        System.out.println("============================");
        int orderNumber = sc.nextInt();
        if (orderNumber == 9) {
            return;
        } else {
            //구매 성공하고 금액 누적하기
            userService.orderSuccess(orderNumber);
        }
    }

    public void viewMenu() {
        System.out.println("메가 커피 메뉴");
        System.out.println("----------------------------------");
        //배열을 읽어서 메뉴와 가격을 출력
        for (int i = 0; i < CoffeeMain.coffeelist.size(); i++) {
            System.out.println("index = " + i + ",");
            System.out.println(CoffeeMain.coffeelist.get(i));
        }
        System.out.println("----------------------------------");
        System.out.println("9. 돌아가기");
    }
}
