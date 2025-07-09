package vo;


public class DogFamily {
    public DogFamily(String kind, String name, String color, int age) {
        this.kind = kind;
        this.name = name;
        this.color = color;
        this.age = age;
    }



    @Override
    public String toString() {
        return "OurDog{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    private String kind ;
    private String name ;
    private String color ;
    private int age ;


    public String getName() {
        return this.name;
    }

    public String getKind() {
        return this.kind;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
