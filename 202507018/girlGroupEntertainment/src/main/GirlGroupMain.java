package main;

import db.DBConn;
import view.UserView;

import java.sql.Connection;
import java.util.Scanner;

public class GirlGroupMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserView userView = new UserView();
        userView.entertainmentView();
        System.out.println("1.걸그룹 정보 보기 2.소속사의 그룹 정보");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                userView.girlGroupView();
                break;
            case 2:
                break;


        }
    }
}
