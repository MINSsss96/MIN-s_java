package view;

import dto.EntertainmentDto;
import dto.GirlDto;
import service.GirlGroupService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    private GirlGroupService girlGroupService = new GirlGroupService();

    public void girlGroupView() {

        System.out.println("===소속사의 걸그룹 정보 보기===");

    }
    public void entertainmentView(){
        List<EntertainmentDto> dtoList = new ArrayList<>();
        dtoList = girlGroupService.getListAll();

    }

    public void findAllView(){
    }

}
