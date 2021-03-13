package exercise2021_01_20;

import java.util.Scanner;

public class Demo04 {
    static int n,k;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正整数:");
        int n = scanner.nextInt();
        k = 2;
        System.out.print(n + "=");
        Demo04 d=new Demo04();
        d.f(n);
    }

    public void f(int n){
        while (n>=k){
            if (n==k){
                System.out.print(k);
                break;
            }else if (n>k && n % k == 0) {
                System.out.print(k + "*");
                n = n / k;
                f(n);
                break;
            } else if (n>k && n%k != 0){
                k++;
                f(n);
                break;
            }
        }
    }
}
