package view;

import repository.MemberRepository;
import service.MemberServiceImpl;
import service.Service;
import vo.Member;

import javax.swing.text.View;
import java.util.*;

public class ViewImpl implements ViewInterface {
    Scanner sc = new Scanner(System.in);
    // 멤버 서비스 생성하기
    Service memberservice = new MemberServiceImpl();

    @Override
    public void addView() {
        System.out.println("멤버 추가 화면");
        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("나이 : ");
        int age = sc.nextInt();

        // 빈 깡통 멤버 생성 후 이름, 나이 할당
        Member member = new Member();
        member.setName(name);
        member.setAge(age);

        // 멤버 서비스의 addStore로 멤버를 실어서 보냄
        memberservice.addStore(member);
        System.out.println("정상적으로 추가되었습니다.");
    }

    @Override
    public void updateView() {
        System.out.println("멤버 수정 화면");
        ListView();
        System.out.println("수정할 아이디를 입력하세요");
        int oldId = sc.nextInt();
        Member member = memberservice.findById(oldId);
        if (member != null) {
            System.out.println(member.getName() + "의 정보를 수정할까요?(Y/N)");
            String confirm = sc.next();
            if (confirm.toUpperCase().equals("Y")) {
               memberservice.updateStore(oldId, member);
                System.out.println("수정할 이름");
                String updateName = sc.next();
                System.out.println("수정할 나이");
                int age = sc.nextInt();
                member.setName(updateName);
                member.setAge(age);
                System.out.println( "----수정처리하기----");
                return;
            }
            else {
                System.out.println("수정처리가 취소되었습니다.");
                return;
            }
        }

    }

    @Override
    public void removeView() {
        System.out.println("멤버 삭제 화면");
        ListView();
        System.out.println("삭제할 아이디를 입력하세요");
        int deleteId = sc.nextInt();
        Member member = memberservice.findById(deleteId);
        // 찾아온 멤버 정보가 있는지 없는지 확인
        if (member != null) {
            System.out.println(member.getName() + "의 정보를 정말로 삭제할까요?(Y/N)");
            String confirm = sc.next();
            if (confirm.toUpperCase().equals("Y")) {
                memberservice.removeStore(deleteId);
                System.out.println("삭제가 완료되었습니다.");
                // 리스트 다시 보여주기
                ListView();
            } else {
                System.out.println("삭제처리가 취소되었습니다.");
                return;
            }
                // 삭제 처리


        }else{
                System.out.println("삭제할 정보가 없습니다.");
                return;

        }
        // 삭제할 정보가 있는지 확인




    }

    @Override
    public void ListView() {
        //전체 데이터를 받을 맵을 선언
        Map<Integer, Member> lists = new HashMap<>();
        System.out.println("멤버 리스트보기 화면");

        //전체 멤버 데이터(맵) 받아오기

        lists = memberservice.findAll();
        // 전체 데이터가 비었는지 확인
        if (lists.size() == 0) {
            System.out.println("자료가 없습니다.");
            return;
        } else {
            title();
            //출력하기
            for (Integer x : lists.keySet()) {
                System.out.println(lists.get(x));
            }
            line();
        }

    }

    private void title() {
        line();
        System.out.println("ID  NAME AGE");
        line();
    }

    private void line() {
        System.out.println("================");

    }
}
