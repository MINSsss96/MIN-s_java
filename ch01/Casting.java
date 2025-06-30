package ch01;

public class Casting {


        // 형변환
        // 다운캐스팅(down-casting)
        // 업캐스팅(up-casting)

        public static void main(String[] args) {
            int n1 = 100; // 4byte(21억)
            System.out.println(n1);

            double d1 = n1; // 묵시적 업캐스팅 (업캐스팅 : 작은 것에서 큰것으로 변환)
            System.out.println(d1);

            long longType = 100;
            System.out.println(longType);

            int intType = (int) longType; // 명시적 다운 캐스팅(다운캐스팅 : 큰것에서 작은것으로 변환)



    }
}
