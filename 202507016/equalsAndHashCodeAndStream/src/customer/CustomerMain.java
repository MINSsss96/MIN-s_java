package customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        Customer lee = new Customer("이순신", 40, 100);
        Customer kim = new Customer("김유신", 20, 100);
        Customer hong = new Customer("홍길동", 13, 50);

        List<Customer> customers = new ArrayList<>();
        customers.add(lee);
        customers.add(kim);
        customers.add(hong);

        System.out.println("1. 고객명단 순서로 출력하기");
        customers.stream().forEach(x-> System.out.println(x));

        System.out.println("2. 고객명단에서 순서대로 이름만 출력하기");
        customers.stream().map(x -> x.getName()).forEach(x-> System.out.println(x));

        System.out.println("3. 총 여행 경비 출력하기");
        int totalPrice = customers.stream().mapToInt(x -> x.getPrice()).sum();
        System.out.println("총 여행 경비는" + totalPrice);

        System.out.println("4. 20세 이상 고객 중 고객 이름만 오름차순으로 출력");
        customers.stream().filter(x -> x.getAge() >= 20)
                .map(x ->x.getName())
                .sorted()
                .forEach(x-> System.out.println(x));

        System.out.println("5. 20세 이상 고객 명단 전체를 내림차순으로 출력");
        customers.stream().filter(x -> x.getAge() >= 20)
                .sorted(Comparator.comparing(Customer::getName).reversed())
                .forEach(x-> System.out.println(x));
    }
}
