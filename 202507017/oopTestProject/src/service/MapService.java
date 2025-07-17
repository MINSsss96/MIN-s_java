package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapService implements Crud {
    public static Map<Integer, String> map = new HashMap<>();
    public static int k = 1;



    @Override

    public void insert(String name) {
        map.put(k, name);
        k++;
    }

    @Override
    public List<String> showList() {
        List<String> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            list.add(map.get(i));
        }

        return list;
    }
}
