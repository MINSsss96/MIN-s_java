package view;

import repository.MenuRepository;
import service.AdminService;
import service.UserService;

import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    UserService userService = new UserService();
    AdminService adminService = new AdminService();
    AdminView adminView = new AdminView();

    public void viewscreen() {
        while (true) {
            System.out.println("1. 동전 투입 2. 잔돈 반환 3. 메뉴선택 4. 관리자 메뉴 5. 종료");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("돈을 넣어주세요");
                    System.out.println("1: 5,000원 2: 1,000원 3: 5000원 4: 100원");
                    userService.inputCoin();
                    break;
                case 2:
                    userService.returnChange();
                    break;
                case 3:
                    if (MenuRepository.menuList.size() == 0) {
                        System.out.println("제품이 존재하지 않습니다.");
                    } else {
                        adminService.menuPrint();
                        System.out.println("원하는 제품명을 입력하세요");
                        String product = sc.next();
                        userService.menuChoice(product);
                    }
                    break;
                case 4:
                    adminView.adminMenu();
                    break;
                case 5:
                    return;
            }
        }

    }

}
