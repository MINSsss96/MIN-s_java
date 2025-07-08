package oopTest;

import javax.annotation.processing.Generated;

public class MegaCoffeeMenu {
    private String menuName = "아메리카노";
    private int price = 1800;
    private int salesTotal = 0;
    //getter 와 setter를 만들자 -> public

    public String getMenuName(){
        return this.menuName;
    }
    public int getPrice(){
        return this.price;
    }

    //setter 생성


    public void setMenuName(String changeName) {
        this.menuName = changeName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
