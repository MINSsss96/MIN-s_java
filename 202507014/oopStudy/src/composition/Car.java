package composition;

public class Car {
    private String name;
    private Engine engine;

    //생성 시에 name을 받아서 생성
    public Car(String name,Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return this.name;
    }

    //Engine 의 Getter 생성
    public Engine getEngine() {
        return this.engine;
    }

}
