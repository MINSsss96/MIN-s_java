package equalsAndHashCode;

public class HashCodeTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("장원영");
        p1.setAge(20);
        System.out.println(p1);

        Person p2 = new Person();
        p2.setName("장원영");
        p2.setAge(21);
        System.out.println(p2);

        if (p1 == p2) {
            System.out.println("p1과 p2 는 같다.");
        } else {
            System.out.println("같지 않다.");
        }
        System.out.println("=========================");

        if (p1.equals(p2)) {
            System.out.println("p1과 p2 는 같다.");
        } else {
            System.out.println("같지 않다.");
        }
        System.out.println("=========================");

        if (p1.getName().equals(p2.getName())) {
            System.out.println("p1과 p2 는 같다.");
        } else {
            System.out.println("같지 않다.");
        }
        System.out.println("=========================");

        if (p1.getAge() == p2.getAge()) {
            System.out.println("p1과 p2 는 같다.");
        } else {
            System.out.println("같지 않다.");
        }
        System.out.println("=========================");

    }
}
