package vo;

public class Car {
    private String model;
    private int engine;
    private String color;
    private int speed = 0;

    //생성자 만들기
    public Car(String model, int engine) {
        this.model = model;
        this.engine = engine;
    }

    //기본생성자(Default constructor)
    public Car() {
    }

    ;


    // getter
    public String getModel() {
        return this.model;
    }

    public int getEngine() {
        return this.engine;
    }

    // setter
    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void currentSpeed(){
        System.out.println("현재 속도는 " + speed + "km/h 입니다.");

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    //method : Car 인스턴스가 실행하게 될 동작
    public void speedUp() {
        if (this.speed >= 30) {
            speed = 30;
            System.out.println("한계 속도에 도달했습니다.");
            currentSpeed();
        } else {
            speed = speed + 5;
            currentSpeed();
        }
    }

    public void speedDown() {
        if (this.speed <= 0) {
            speed = 0;
            System.out.println("차가 멈추었습니다.");
            currentSpeed();
        } else {
            speed = speed - 5;
            if (speed <= 0) {
                speed = 0;

                System.out.println("차가 멈추었습니다.");
            }
            currentSpeed();

        }
    }

}
