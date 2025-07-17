package view;

import service.Crud;
import service.ListService;
import service.MapService;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ViewMember {
    private Scanner sc = new Scanner(System.in);
  //  private Crud listService = new ListService();
  private Crud listService = new MapService();

    public void insertView(){
        System.out.println("이름");
        String name = sc.next();
        listService.insert(name);

    }
    public void outputView(){
        System.out.println("출력");
        List<String> list = listService.showList();
        list.stream().forEach(x -> System.out.println(x));
    }

}
