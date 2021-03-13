package day02;

public class Demo6 {
    public static void main(String[] args) {
        int number=0;
        for (int i = 101; i <=200 ; i++) {
            for (int j = 2; j <i/2 ; j++) {
                if (i%j==0)
                    number=1;
            }
            if (number==0)
                System.out.println(i);
            number=0;
        }
    }
}
