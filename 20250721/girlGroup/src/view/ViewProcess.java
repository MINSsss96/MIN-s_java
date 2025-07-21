package view;

import dto.Entertainment;
import dto.GirlGroup;
import service.EnterService;

import java.util.List;

public class ViewProcess {
    EnterService enterService = new EnterService();

    public void getEntertainment(){
        System.out.println("소속사 정보 출력");
        List<Entertainment> entertainments = enterService.getAllEntertainment();
        entertainments.stream()
                .forEach(x -> System.out.println(x));
        System.out.println("=============================");
    }

    public void findByEnterId(int num){
        System.out.println("그룹 정보");
        List<GirlGroup> groups = enterService.getGroups(num);
        groups.stream()
                .forEach(x -> System.out.println(x));

    }
}
