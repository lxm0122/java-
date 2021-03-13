package day02;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"月，这个月有31天");break;
            case 2:
                System.out.println(month+"月，这个月有28天");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月，这个月有30天");break;
                default:
                    System.out.println("非法月份");break;
        }
    }
}
