package main;

import vo.DogFamily;

public class DogMain {
    public static void main(String[] args) {
        DogFamily coco = new DogFamily("마르티즈", "코코", "흰색", 2);
        DogFamily chichi = new DogFamily("치와와", "치치", "검정", 1);
        DogFamily dungchi = new DogFamily("리트리버", "덩치", "골드", 3);

        DogFamily[] ourDogs = new DogFamily[3];
        ourDogs[0] = coco;
        ourDogs[1] = chichi;
        ourDogs[2] = dungchi;

        for (DogFamily x : ourDogs) {
            System.out.println(x);
        }

        System.out.println("==========================");
        ourDogs[2].setName("망치");
        ourDogs[0].setAge(5);
        for (DogFamily x : ourDogs) {
            System.out.println(x);
        }
    }
}
