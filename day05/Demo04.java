package day05;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hotel hotel = new hotel();
        int roomnum;
        System.out.println("欢迎来到大酒店");
        while (true) {
            System.out.println("请输入指令：查询（show）   入住（in）   退房（out）  退出系统（exit）");
            String enter = scanner.next();
            switch (enter) {
                case "show":
                    hotel.show();break;
                case "in":
                    System.out.println("请输入入住房间：");
                    roomnum = scanner.nextInt();
                    System.out.println("请输入入住客人名字：");
                    String name = scanner.next();
                    hotel.in(roomnum, name);break;
                case "out":
                    System.out.println("请输入退房房间");
                    roomnum = scanner.nextInt();
                    hotel.out(roomnum);break;
                case "exit":
                    System.exit(0);break;
                default://scanner.nextInt();
            }

        }
    }
}
