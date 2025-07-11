package view;

import repository.MenuRepository;
import service.AdminService;

import java.util.Scanner;

public class AdminView {
    private Scanner sc = new Scanner(System.in);
    AdminService adminService = new AdminService();
    private String productName = "";
    private int updateStock = 0;

    public void adminMenu() {
        while (true) {
            System.out.println("1.메뉴 등록 2.메뉴 삭제 3.메뉴 수정 4.재고 등록 5.전체목록보기 6. 매출 7.이전");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("자판기 메뉴 등록");
                    System.out.println("제품의 이름을 입력하세요");
                    String newProduct = sc.next();
                    System.out.println("제품의 가격?");
                    int newPrice = sc.nextInt();
                    System.out.println("재고 등록(채울 개수)");
                    int newStock = sc.nextInt();
                    adminService.menuAdd(newProduct, newPrice, newStock);

                    break;
                case 2:
                    System.out.println("삭제할 제품명 입력 : ");
                    String deleteName = sc.next();
                    adminService.menuDelete(deleteName);
                    adminService.menuPrint();
                    break;
                case 3:
                    adminService.menuPrint();
                    System.out.println("수정할 제품명 입력");
                    productName = sc.next();
                    System.out.println("(수정) 메뉴 이름?");
                    String updateName = sc.next();
                    System.out.println("(수정) 메뉴 가격?");
                    int updatePrice = sc.nextInt();
                    System.out.println("(수정) 메뉴 수량?");
                    updateStock = sc.nextInt();
                    adminService.menuUpdate(productName, updateName, updatePrice, updateStock);
                    adminService.menuPrint();
                    break;
                case 4:
                    adminService.menuPrint();
                    System.out.println("수정할 제품명 입력");
                    productName = sc.next();
                    System.out.println("(수정) 재고 수량?");
                    updateStock = sc.nextInt();

                    adminService.stockAdd(productName, updateStock);
                    adminService.menuPrint();
                    break;
                case 5:
                    adminService.menuPrint();
                    break;
                case 6:
                    System.out.println("매출 합계");
                    int totalPrice = 0;
                    for (int j = 0; j < MenuRepository.menuList.size(); j++) {
                        totalPrice = totalPrice + MenuRepository.menuList.get(j).getSales();
                    }
                    System.out.println(totalPrice);

                    break;
                case 7:
                    return;

            }
        }
    }
}
