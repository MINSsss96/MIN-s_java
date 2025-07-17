package service;

import java.util.ArrayList;
import java.util.List;

public class ListService implements Crud {
    public static List<String> list = new ArrayList<>();

    @Override
    public void insert(String name) {
        list.add(name);

    }

    @Override
    public List<String> showList() {
        return list;
    }

}
