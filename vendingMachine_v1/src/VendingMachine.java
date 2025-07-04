import javax.swing.*;
import java.util.Scanner;

public class VendingMachine {
    Scanner sc = new Scanner(System.in);
    static String[] product = new String[5]; // 제품명
    static int[] price = new int[5]; // 단가
    static int[] stock = new int[5]; // 재고 수량


    public static void main(String[] args) {
        //1.사용자 메뉴 2. 관리자 메뉴

        dataInitialize();

        mainMenu();

        return;

    }

    private static void dataInitialize() {
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 3;

        product[2] = "커피";
        price[2] = 1500;
        stock[2] = 3;
    }

    private static void mainMenu() {

        while (true) {
            System.out.println("=================");
            System.out.println("자판기입니다.(번호 : 상품(가격) - 재고");
            System.out.println("1." + product[0] + price[0] + "원" + stock[0] + "개 " + "2." + product[1] + price[1] + "원" + stock[1] + "개" + "3." + product[2] + price[2] + "원" + stock[2]+ "개");
        return;
        }

    }


}
