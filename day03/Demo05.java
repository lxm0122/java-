package day03;

public class Demo05 {//方法重载

    public static void main(String[] args) {
        print(11);
        print(3.1415926);
        print('a');
        print(true);
    }
    public static void print(int a){
        System.out.println(a);
    }
    public static void print(double a){
        System.out.println(a);
    }
    public static void print(char a){
        System.out.println(a);
    }
    public static void print(boolean a){
        System.out.println(a);
    }

}
