public class ProtossUnit {
    private String name= "프로토스유닛";
    // 자식에서 구현예정, 부모꺼는 무시될 예정

    public void basicAttack(ProtossUnit e1) {
        System.out.println("프로토스유닛 메서드");
    }

    public String confirmName(){
        return this.name;
    }

}
