package exercise2021_01_20;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rabbit[]=new int[1000];
        rabbit[0]=2;
        rabbit[1]=2;
        for (int i=2;i<=20;i++){
            rabbit[i]=rabbit[i-1]+rabbit[i-2];
            System.out.println(i+"月的兔子数量:  "+rabbit[i]);
        }
    }
}
