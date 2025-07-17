package main;

import view.ViewMember;

import javax.swing.text.View;
import java.util.Scanner;

public class MainClazz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ViewMember viewMember = new ViewMember();
        while (true) {
            System.out.println("1. 입력 2. 보기");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    viewMember.insertView();
                    break;
                case 2:
                    viewMember.outputView();
                    break;

            }
        }
    }
}
