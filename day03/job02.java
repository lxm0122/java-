package day03;

import java.util.Arrays;
import java.util.Scanner;

public class job02 {
    public static void main(String[] args) {
        boolean flag = true;
        char[] problem;
        char[] guess;
        Scanner scanner = new Scanner(System.in);
        problem=getArrays();
        while (flag) {
            System.out.println("你猜？");

            String answer = scanner.nextLine();
            guess = answer.toCharArray();

            if (answer.equals("byebye")) {
                flag = false;
            }
            else {
                System.out.println("你的答案" + Arrays.toString(guess));
                int[] rightNum=determine(guess,problem);
                System.out.println("你猜对了" + rightNum[0] + "个字符");
                System.out.println("其中" + rightNum[1] + "个字符位置正确");


                if (rightNum[1] == 5) {
                    System.out.println("恭喜你全猜对了");
                    flag = false;
                }
            }
        }
        System.out.println("答案："+Arrays.toString(problem));
    }
    public static char[] getArrays(){
        char[] forchar=new char[5];
        for (int i = 0; i < 5; i++) {
            forchar[i] = (char) (Math.random() * 26 + 97);
            for (int j=0;j<i;j++){
                if (forchar[j]==forchar[i])
                    i--;
            }
        }
        return forchar;
    }
    public static int[] determine(char[] guess,char[] problem){
        int[] rightNum=new int[2];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (guess[j] == problem[i])
                    rightNum[0]++;
            }
            if (guess[j] == problem[j])
                rightNum[1]++;
        }
        return rightNum;
    }
}
