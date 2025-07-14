package extendTest;

import composition.Car;
import composition.Engine;

public class BurgerMain {
    public static void main(String[] args) {
        //햄버거 푸드트럭 생성
        //새로운 엔진을 생성
        Engine engine = new Engine();

        Car foodTruck = new Car("푸드트럭", engine);
        System.out.println(foodTruck.getName());
        System.out.println(foodTruck.getEngine().getPower());

        // 상속받은 자식클래스 생성
        CheeseBurger cheese = new CheeseBurger();
        System.out.println(cheese.getName());
        System.out.println(cheese.getMat_1());
        System.out.println(cheese.getMat_2());

        //부모클래스를 생성하기
        Hamburger hamburger = new Hamburger();
        System.out.println(cheese.getName());
        System.out.println(cheese.getMat_1());
        System.out.println(cheese.getMat_2());

        //햄버거 클래스의 내용을 출력
        System.out.println(hamburger.toString());
        System.out.println(cheese.toString());

        //치킨버거
        ChickenBurger chicken = new ChickenBurger();
        System.out.println(cheese.getName());
        System.out.println(cheese.getMat_1());
        System.out.println(cheese.getMat_2());
    }

}
