public class StarcraftMain {
    public static void main(String[] args) {
        // 자식 타입으로 선언(상속)
        // 내꺼 내꺼, 부모꺼 내꺼
        Zealot zealot = getZealot();
        Dragon dragon = new Dragon();
        DarkTempler darkTempler = new DarkTempler();


        String name = zealot.confirmName();
        System.out.println(name);
        zealot.basicAttack(dragon);
        dragon.basicAttack(darkTempler);

        darkTempler.basicAttack(zealot);
        System.out.println("=====================");
        // 부모타입으로 선언
        // 부모꺼 부모꺼, 자식한테 똑같은 매서드 있으면 자식꺼 실행
        // 결국 부모꺼는 개무시
        ProtossUnit z = new Zealot();
        ProtossUnit d = new DarkTempler();
        d.basicAttack(z);
        System.out.println("=====================");
        ProtossUnit r = new Rever();
        r.basicAttack(d);
    }

    private static Zealot getZealot() {
        Zealot zealot = new Zealot();
        return zealot;
    }
}
