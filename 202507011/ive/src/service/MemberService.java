package service;

import repository.IveRepository;
import vo.Member;

import javax.print.DocFlavor;

public class MemberService {
    //Create
    //view에서 사용자에게 입력받은 이름, 닉네임을 전달 받음
    public void memberInsert(String name, String nickName) {
        Member member = new Member();
        member.setName(name);
        member.setNickName(nickName);
        IveRepository.memberList.add(member);
    }
    //Read
    public void memberPrint() {
        System.out.println("===============================");
        if (IveRepository.memberList.size() == 0) {
            System.out.println("멤버가 없습니다.");
        } else {
            for (Member ive : IveRepository.memberList) {
                System.out.println(ive.toString());
            }
        }
        System.out.println("===============================");

    }

    //Update
    public void memberUpdate(String name, String nickName) {
        // 닉네임만 업데이트하기
        // 건네받은 name으로 인덱스찾기
        int updateIndex = findByName(name);
        // 멤버 인스턴스 생성 후 name, nickname 주기
        Member updateMember = new Member();
        updateMember.setName(name);
        updateMember.setNickName(nickName);
        // 수정하기
        IveRepository.memberList.set(updateIndex, updateMember);
        System.out.println("정상적으로 수정되었습니다.");

    }

    //Delete
    public void memberDelete(String deleteName) {
        // 리스트에서 이름으로 삭제할 멤버의 인덱스를 찾아야함.
        // 자동으로 리턴타입으로 결과 받기 : Ctrl + Alt + V
        int findId = findByName(deleteName);
        // 삭제처리 하기.
        //findId = -1 이면 삭제실패, 그 외 정수이면 삭제처리하기
        if (findId == -1) {
            System.out.println("없는 멤버입니다. 삭제 실패");
        } else {
            IveRepository.memberList.remove(findId);
            System.out.println("삭제완료");

        }
    }

    private int findByName(String name) {
        int findId = -1;
        for (int i = 0; i < IveRepository.memberList.size(); i++) {
            if (IveRepository.memberList.get(i).getName().equals(name)) {
                findId = i;
                return findId;
            }

        }
        return findId;
    }
}
