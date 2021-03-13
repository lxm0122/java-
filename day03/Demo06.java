package day03;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] array=new int[5];
        array=new int[10];
        int[] array2={1,2,3,4,5};
        int[] array3=new int[]{5,4,3,2,1};
        array3=new int[]{6565,4,7};
        System.out.println(array2.length);
        //数组扩容
        array2= Arrays.copyOf(array2,array2.length-1);
        array2[array2.length-1]=2077;
        System.out.println(Arrays.toString(array2));
        //数组排序
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

    }
}
