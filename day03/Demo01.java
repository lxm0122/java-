package day03;

import java.util.Scanner;

public class Demo01<n> {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 200 + 1);
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while(n!=num) {
            n = scanner.nextInt();
            if (n > num){
                System.out.println("大了");
            }else if (n<num){
                System.out.println("小了");
            }else System.out.println("猜对了");
        }
    }
}
