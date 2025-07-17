package streamTest;

import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {
                "안녕하세요~~",
                "hello",
                "Good morning",
                "반갑습니다^^"
        };
        String result;
        // 람다식으로 reduce() 구현 -> 내가 만든 함수
        result = Arrays.stream(greetings).reduce("", (s1, s2)->{
            if (s1.length()>= s2.length()) {
                return s1;
            } else {
                return s2;
            }
        });


        System.out.println(result);

    }
}
