package exercise2021_01_20;

public class Demo03 {
    public static void main(String[] args) {
        int a,b,c;
        int s=100;
        while (s<1000) {
            a = s % 10;
            b = (s / 10) % 10;
            c = s / 100;
            if (a*a*a+b*b*b+c*c*c==s){
                System.out.println(s);
            }
            s++;
        }
    }
}
