package vo;

import java.util.Map;

public class Member {

    private String member;
    private int id;
    private String name;
    private int age;

    public String toString(){
        return id + "\t" + name + "\t" + age; // \t : tab, \n : 한줄 바꾸기
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
