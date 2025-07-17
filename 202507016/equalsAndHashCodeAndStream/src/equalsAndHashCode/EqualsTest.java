package equalsAndHashCode;

public class EqualsTest {
    public static void main(String[] args) {
        // primitive type 동등성 체크
        // int, long, double, boolean
        int a= 3;
        int b =3;
        // a와 b 가 같은 주소의 상수 3을 가리키고 있기 때문.
        // constant pool에 값 3이 생성
        // 주소를 먼저 비교해서 같으면 같다고 판단.

        Integer A = 4;

        if (a == b) {
            System.out.println(" a와 b는 같다.");
        } else {
            System.out.println(" 같지 않다");
        }

        String str1 = "장원영";
        String str2 = "장원영";

        if (str1 == str2) {
            System.out.println(" str1과 str2는 같다.");
        } else {
            System.out.println(" 같지 않다");
        }

        String str3 = "안유진";
        String str4 = new String("안유진");
        if (str3 == str4) {
            System.out.println(" str3과 str4는 같다.");
        } else {
            System.out.println(" 같지 않다");
        }

        String str5 = new String("카리나");
        String str6 = new String("카리나");
        if (str5.equals(str6) ) {
            System.out.println(" str5과 str6는 같다.");
        } else {
            System.out.println(" 같지 않다");
        }

    }

}
