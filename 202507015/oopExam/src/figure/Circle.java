package figure;

public class Circle extends Figure {
    private int radius;


    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getName() {
        return "원형";
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setHeight(int height) {

    }

    public void setRadius(int radius){
        this.radius = radius;

    }
}
