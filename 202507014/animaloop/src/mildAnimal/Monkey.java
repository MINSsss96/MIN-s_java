package mildAnimal;

import abstractClass.MildAnimal;

public class Monkey extends MildAnimal {

    @Override
    public void collect() {
        System.out.println("원숭이 : 바나나를 모으기");
    }

    @Override
    public void up() {
        System.out.println("원숭이 : 나무사이로 오르기");
    }

    @Override
    public void down() {
        System.out.println("원숭이 : 가끔 떨어지기");
    }

    @Override
    public void hide() {
        System.out.println("원숭이 : 나무위로 숨기");
    }
}
