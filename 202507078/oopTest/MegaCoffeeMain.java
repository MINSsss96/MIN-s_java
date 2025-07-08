package oopTest;

public class MegaCoffeeMain {
    public static void main(String[] args) {
        MegaCoffeeMenu coffeeMenu = new MegaCoffeeMenu();

        String menu = coffeeMenu.getMenuName();
        System.out.println(menu);
        int price = coffeeMenu.getPrice();
        System.out.println(price);
        //메뉴명을 변경
        coffeeMenu.setMenuName("메가리");
        System.out.println(coffeeMenu.getMenuName());
        coffeeMenu.setPrice(50000);
        System.out.println(coffeeMenu.getPrice());
    }
}
