package service;

import arrayListTest.DogMain;
import main.CoffeeMain;
import view.UserView;
import vo.Coffee;

import java.util.Scanner;

public class AdminService {
    private Scanner sc = new Scanner(System.in);
    private UserView userView = new UserView();

    public void menuUpdate() {
        System.out.println("메뉴 수정 처리 서비스");
        userView.viewMenu();
        System.out.println("수정할 메뉴의 번호를 입력하세요");
        int updateNum = sc.nextInt();
        System.out.println("수정 할 가격을 입력하세요");
        int updatePrice = sc.nextInt();

        //해당 인덱스의 객체 얻어오기
        Coffee coffee = CoffeeMain.coffeelist.get(updateNum);
        coffee.setPrice(updatePrice);
        CoffeeMain.coffeelist.set(updateNum,coffee);
        userView.userScreen();


    }

    public void menuInsert() {
        System.out.println("메뉴 추가 처리 서비스");
        userView.viewMenu();
        //새로운 메뉴 입력 받기
        System.out.println("추가할 메뉴 이름 : ");
        String newProduct = sc.next();
        System.out.println("가격 : ");
        int newPrice = sc.nextInt();

        //비어있는 커피 인스턴스 생성 후 넣어주기
        Coffee coffee = new Coffee();
        coffee.setProduct(newProduct);
        coffee.setPrice(newPrice);

        //리스트에 추가하기
        CoffeeMain.coffeelist.add(coffee);
        System.out.println("====================");
        userView.viewMenu();
    }

    public void adminResult() {
        System.out.println("정산 처리 서비스");
        userView.viewMenu();
        // 총 판매액 계산하고 출력하기
        int totalPrice = 0;
        for (int i = 0; i < CoffeeMain.coffeelist.size(); i++) {
            totalPrice = totalPrice + CoffeeMain.coffeelist.get(i).getSales();
        }
        System.out.println("=============================");
        System.out.println("총 판매금액 : " + totalPrice);
        System.out.println("=============================");
    }
}
