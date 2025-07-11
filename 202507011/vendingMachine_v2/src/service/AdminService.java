package service;

import repository.MenuRepository;
import vo.Menu;

import java.util.Scanner;

public class AdminService {
    private Scanner sc = new Scanner(System.in);

    public void menuAdd(String product, int price, int stock) {
        Menu menu = new Menu();
        menu.setProduct(product);
        menu.setPrice(price);
        menu.setStock(stock);
        MenuRepository.menuList.add(menu);

    }

    public void menuDelete(String name) {

        int findId = findByName(name);

        if (MenuRepository.menuList.size() == 0) {
            System.out.println("메뉴가 존재하지 않습니다.");
        } else {
            MenuRepository.menuList.remove(findId);
            System.out.println("삭제완료");
        }

    }

    public void menuUpdate(String name, String updateName, int price, int stock) {
        int updateIndex = findByName(name);
        Menu updateMenu = new Menu();
        updateMenu.setProduct(updateName);
        updateMenu.setPrice(price);
        updateMenu.setStock(stock);
        MenuRepository.menuList.set(updateIndex, updateMenu);

    }

    public void stockAdd(String name, int stock) {
        int updateIndex = findByName(name);
        Menu addStockMenu = MenuRepository.menuList.get(updateIndex);
        addStockMenu.setStock(stock);
//        Menu updateMenu = new Menu();
//        updateMenu.setProduct(name);
//        for (int i = 0; i < MenuRepository.menuList.size(); i++) {
//            updateMenu.setPrice(MenuRepository.menuList.get(i).getPrice());
//        }
//        updateMenu.setStock(stock);
//        MenuRepository.menuList.set(updateIndex, updateMenu);
        MenuRepository.menuList.set(updateIndex, addStockMenu);
    }

    public void menuPrint() {
        if (MenuRepository.menuList.size() == 0) {
            System.out.println("현재 자판기에 상품이 없습니다.");
        } else {
            System.out.println("================= 메뉴 =================");
            for (Menu num : MenuRepository.menuList) {

                System.out.println(num.toString());

            }
            System.out.println("========================================");
        }


    }

    private int findByName(String name) {
        int findId = -1;
        for (int i = 0; i < MenuRepository.menuList.size(); i++) {
            if (MenuRepository.menuList.get(i).getProduct().equals(name)) {
                findId = i;
                return findId;
            }
        }
        return findId;
    }


}
