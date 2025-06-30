package ch01;
//클래스 변수

public class IveMember {

    // 장원영을 표현할 수 있는
    // Properties(Member) - 속성
    String name = "장원영";
    int age = 22;
    double height = 173.3;

    // 메서드(Method)
    void dance(){
        System.out.println("장원영이 춤춰요");

//   int 심부름(int 돈, int 장바구니){
//        빙구문구 감.
//        아이스크림 고름
//                    잔돈받음
//                            귀가함

    }
}


class Jang {
    public static void main(String[] args) {
        IveMember jang = new IveMember();   //인스턴스
        jang.name = "안유진";
        jang.age = 23;
        jang.height = 173.5;
        jang.dance();
        System.out.println(jang.name);
    }
}