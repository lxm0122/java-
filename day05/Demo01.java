package day05;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1.定义一个int[]类型的数组a，长度为5
        其中第三个元素 有4个元素，并且其中的第4个元素是3
        2.定义一个int[]类型的数组b，长度是6
        其中第4个元素的第2个元素是8，总共有>=2个元素
        3.定义一个int[]类型的数组c，长度是3
        每一个元素，都有4个元素，并且值都是10
        */
        int[][] a=new int[5][4];
        int[][] b=new int[6][2];
        int[][] c=new int[3][4];
        for (int i=0;i<3;i++){
            a[3][i]=3;
        }
        b[3][1]=8;
        b[1][1]=6;
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                c[i][j]=10;
            }
        }
        System.out.println("a:");
        for (int i=0;i<5;i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("b:"+Arrays.toString(b));
        System.out.println("c:"+Arrays.toString(c));
    }
}
