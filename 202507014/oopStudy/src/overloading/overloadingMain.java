package overloading;

public class overloadingMain {
    public static void main(String[] args) {
        Running running = new Running();
        running.run();
        running.run(3);
        running.run(3, 5);
    }

}
