package exercise2021_01_20;

public class Demo02 {
    public static void main(String[] args) {
        int sum=0;
        int o=101;
        while (o<=200) {
            for (int i = 2; i <= o; i++) {
                if (o % i == 1) {
                    sum++;
                    System.out.println(o+"是素数");

                    break;
                }
            }
            o++;
        }
        System.out.println("101~200素数有："+sum);
    }
}
