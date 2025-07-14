package abstractTest;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();


        dog.hello();
        dog.speak();
        cat.speak();
        bird.speak();
    }
}
