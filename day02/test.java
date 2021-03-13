package day02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份：");
        year=scanner.nextInt();
        /*if (year%4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                System.out.println("366");
                else System.out.println("不是闰年");
            }
            else System.out.println("366");
        }else System.out.println("不是闰年");*/

        if (year%4==0&&year%100!=0||year%100==0)
            System.out.println("366");
        else System.out.println("不是闰年");
    }
}
