package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1, "사과");
        mymap.put(2, "바나나");
        mymap.put(2, "딸기");
        System.out.println(mymap.get(2));
        mymap.put(3, "참외");
        System.out.println("=======================");
        for (Integer i : mymap.keySet()) {
            System.out.println(mymap.get(i));

        }
    }
}
