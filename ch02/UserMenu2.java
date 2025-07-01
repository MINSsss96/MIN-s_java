package ch02;

import java.time.Year;
import java.util.Scanner;

public class UserMenu2 {
    public static void main(String[] args) {
        // ⓐ 좋아하는 그룹 번호를 선택하세요
        // ⓑ 1. ive 2. 세븐틴 3. 에스파
        // 2
        // ⓒ 당신은 세븐틴 광팬입니다. -> ⓔ
        // 만약, 없는 번호를 선택하면
        // ⓓ 잘못 선택했습니다. -> ⓐ
        // ⓔ 종료하시겠습니까?(Y/N)

        Scanner sc = new Scanner(System.in);

        int num;
        String choice;
        do {
            System.out.println("좋아하는 그룹 번호를 선택하세요");
            System.out.println("1. ive 2. 세븐틴 3. 에스파");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("당신은 ive 광팬입니다.");
                    break;
                case 2:
                    System.out.println("당신은 세븐틴 광팬입니다.");
                    break;
                case 3:
                    System.out.println("당신은 에스파 광팬입니다.");
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }

            System.out.println("종료하시겠습니까?(Y/N)");
                    choice = sc.next();
                    if (choice.equals("Y") || choice.equals("y")) {
                        return;
                    } else if (choice.equals("N") || choice.equals("n")) {
                        continue;
                    } else {
                        System.out.println("다시입력해주세요");
                    }

        } while (true);

    }
}
