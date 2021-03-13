package day02;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score=0;
        System.out.println("将开始10次加法测试");
        for (int i=1;i<=10;i++) {
            int randomOne = (int) (Math.random() * 100);
            int randomTwo = (int) (Math.random() * 100);
            System.out.println("("+i+"). "+randomOne+" + "+randomTwo+"= ?");
            System.out.print("请输入答案（输入-1退出）:");
            int answer=scanner.nextInt();
            if (randomOne+randomTwo==answer) {
                System.out.println("答对了！");
                score+=10;
            }else if (answer==-1)
                break;
            else System.out.println("答错了！ 请继续答题。");
        }
        System.out.println("测试完成！ 您的成绩是："+score);
    }
}
