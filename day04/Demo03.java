package day04;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        double r;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入圆的周长");
        r=scanner.nextDouble();
        round round=new round(r);
    }
}
