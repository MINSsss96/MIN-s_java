package main;

import vo.Car;

public class MyCarMain {
    public static void main(String[] args) {
        Car sonata = new Car("소나타", 2000);
        sonata.setColor("빨강");
        System.out.println(sonata.toString());
//        for (int i = 1; i <= 8; i++) {
//            sonata.speedUp();
//        }

        sonata.speedUp();
        sonata.speedUp();
        sonata.speedUp();
        for (int i = 1; i <= 5; i++) {
            sonata.speedDown();
            if (sonata.getSpeed() <= 0) {
                break;
            }


        }
    }
}
