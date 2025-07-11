package view;

import repository.IveRepository;
import service.MemberService;
import vo.Member;

import java.util.Scanner;

public class MemberView {
    private Scanner sc = new Scanner(System.in);
    private MemberService memberService = new MemberService();

    public void viewScreen() {
        while (true) {
            //전체 멤버 리스트 출력
            System.out.println("1.리스트  2.입력  3.수정  4.삭제  5.종료");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    memberService.memberPrint();
                    //리스트를 출력
                    break;
                case 2:
                    //입력
                    System.out.println("추가할 멤버의 이름 : ");
                    String name = sc.next();
                    System.out.println(name + "의 닉네임 : ");
                    String nickName = sc.next();
                    memberService.memberInsert(name, nickName);
                    System.out.println("정상적으로 저장되었습니다.");
                    memberService.memberPrint();
                    break;
                case 3:
                    //수정
                    System.out.println("수정할 멤버의 이름을 입력하세요");
                    String updateName = sc.next();
                    System.out.println("바꿀 닉네임을 입력하세요");
                    String updateNickName = sc.next();
                    memberService.memberUpdate(updateName, updateNickName);
                    memberService.memberPrint();
                    break;
                case 4:

                    // 삭제

                    memberService.memberPrint();
                    System.out.println("삭제할 멤버의 이름 : ");
                    String deleteName = sc.next();
                    memberService.memberDelete(deleteName);
                    memberService.memberPrint();

                    break;
                case 5:
                    //종료
                    System.out.println("시스템을 종료합니다.");
                    return;
            }
        }
    }
}
