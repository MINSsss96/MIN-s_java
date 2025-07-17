package streamTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("Adward");
        list.add("Jack");
        // 리스트 내용 출력
        list.stream().forEach(x -> System.out.printf(x+'\t'));

        System.out.println();
        for (String x : list) {
            System.out.printf(x + '\t');
        }
        System.out.println();

        // 리스트 내용을 정렬해서 출력
        list.stream().sorted().forEach(x-> System.out.println(x));
        System.out.println("==========================");
        // 리스트의 각 내용의 길이를 출력
        list.stream().map(x -> x.length()).forEach(x-> System.out.println(x));

        System.out.println("==========================");
        // 길이가 5이상인 자료만 출력하기
        list.stream().filter(x -> x.length() > 5).forEach(x -> System.out.println(x));
        System.out.println("==========================");
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        // 합계 출력
        // object의 Integer -> primitive int로 바꿔야함
        int sum = intList.stream().mapToInt(x -> x.intValue()).sum();
        System.out.println(sum);
    }
}
