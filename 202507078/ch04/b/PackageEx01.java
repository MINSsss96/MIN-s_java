package ch04.b;

import ch04.a.Calc;

public class PackageEx01 {
    public static String myName = "장원영";
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.add();
        System.out.println();
        System.out.println(Calc.myName);
    }
}
