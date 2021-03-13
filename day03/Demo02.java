package day03;

public class Demo02 {
    public static void main(String[] args) {
        loop1:for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++){
                System.out.println(i+","+j);
                if (j==3)
                    break loop1;
            }
        }
    }
}
