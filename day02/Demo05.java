package day02;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rabbitSum[]=new int[1000];
        rabbitSum[0]=2;
        rabbitSum[1]=2;
        System.out.println("输入月份：");
        int month=scanner.nextInt();
        if (month<=0){
            System.out.println("输入月份错误！");
        }else
            for (int i=2;i<month;i++) {
                rabbitSum[i]=rabbitSum[i-2]+rabbitSum[i-1];
            }
            System.out.println("该月兔子数量："+rabbitSum[month-1]);
        }
    }
