package service;

import vo.Member;

import java.util.Map;
//Create : addStore(Member) put(key,Member) ---> Key는 자동으로
//Read : findById(id) get(key) ---> Member
//ReadAll : findAll() for --- Map
//Update : updateStore(id, Member) put(key, Member) --- boolean
//Delete : removeStor(id) remove(key) --- boolean

public interface Service {
void addStore(Member member);

    Member findById(int id);

    Map<Integer, Member> findAll();

    boolean updateStore(int id, Member member);

    boolean removeStore(int id);

}
