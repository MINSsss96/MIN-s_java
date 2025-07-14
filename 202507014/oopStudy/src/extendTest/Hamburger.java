package extendTest;

//부모 클래스
public class Hamburger extends Object{
    private String name = "기본햄버거";
    private String mat_1 = "번";
    private String mat_2 = "양상추";

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", mat_1='" + mat_1 + '\'' +
                ", mat_2='" + mat_2 + '\'' +
                '}';
    }

    //getter
    public String getName() {
        return this.name;
    }

    public String getMat_1() {
        return this.mat_1;
    }

    public String getMat_2() {
        return this.mat_2;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setMat_1(String mat_1) {
        this.mat_1 = mat_1;
    }

    public void setMat_2(String mat_2) {
        this.mat_2 = mat_2;
    }
}
