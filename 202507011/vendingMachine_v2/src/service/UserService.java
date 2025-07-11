package service;

import repository.MenuRepository;
import vo.Menu;

import java.util.Scanner;

public class UserService {
    private int availableCoin = 0;
    private Scanner sc = new Scanner(System.in);
    private int coin = 0;
    AdminService adminService = new AdminService();

    public void inputCoin() {


        int num = sc.nextInt();

        switch (num) {
            case 1:
                coin = 5000;
                break;
            case 2:
                coin = 1000;
                break;
            case 3:
                coin = 500;
                break;
            case 4:
                coin = 100;
                break;
        }
        System.out.println("투입금액 : " + coin + "원");
        availableCoin = availableCoin + coin;
        System.out.println("사용 가능 금액 : " + availableCoin + "원");

    }

    public void returnChange() {
        System.out.println(availableCoin + "원 반환 완료");
        availableCoin = 0;
    }

    public void menuChoice(String name) {


        for (int i = 0; i < MenuRepository.menuList.size(); i++) {
            if (MenuRepository.menuList.get(i).getProduct().equals(name)) {
                int stock = MenuRepository.menuList.get(i).getStock() - 1;
                availableCoin = availableCoin - MenuRepository.menuList.get(i).getPrice();
                MenuRepository.menuList.get(i).setStock(stock);

                Menu orderProduct = MenuRepository.menuList.get(i);
                orderProduct.sumPrice();

                System.out.println(MenuRepository.menuList.get(i).getProduct() + " 출력완료, " + "남은 돈 : " + availableCoin + "원, " + "재고 :" + MenuRepository.menuList.get(i).getStock());

            }


        }


    }

}
