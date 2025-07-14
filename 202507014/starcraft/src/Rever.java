public class Rever extends ProtossUnit {
    private String name = "리버";

    public String confirmName(){
        return this.name;
    }
    public void basicAttack(Dragon e) {
        System.out.println(this.name + "이" + e.confirmName() + "을 공격");
    }

}
