package day03;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        int s,d;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextInt();
        d=scanner.nextInt();
        int a=bbb(s,d);
        aaa();
        System.out.println(a+"针不戳");
    }
    private static int bbb(int a,int b){
        return a+b;
    }
    private static void aaa(){
        System.out.print("赛博朋克");
    }
}
