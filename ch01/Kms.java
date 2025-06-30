package ch01;

public class Kms {
    static int n2 = 20; //VarEx02라는 static 공간의 n2로 할당
    public static void main(String[] args){
        int n1 = 10; //해당 라인이 실행될 때 10이라는 값이 n1이라는 메모리에 할당 된다.
        System.out.println(n1);
        System.out.println(n2); //non-static field error
        }
}
