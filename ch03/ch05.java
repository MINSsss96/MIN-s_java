package ch03;

public class ch05 {
    static class player{
        String name;
        private int thirsty;

        public player(String name, int thirsty)
        {
            this.name = name;
            this.thirsty = thirsty;
        }
        int 목마름상태확인(){
            return this.thirsty;
        }

        void 물마시기() {
            System.out.println("물마시기 행위");
            this.thirsty = this.thirsty - 50;

        }
    }

public class OOPEx01{
    public static void main(String[] args) {
        player p1 = new player("홍길동", 100);
        System.out.println("dlfmadms : " + p1.name);
        System.out.println("갈증지수 : " + p1.목마름상태확인());


    }
}
}


