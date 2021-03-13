package day04;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] src={1,2,3,4,5,6};
        int[] dest=new int[9];
        int[] newArr= Arrays.copyOf(src,8);
        System.out.println(Arrays.toString(newArr));


        System.arraycopy(src,2,dest,3,4);
        System.out.println(Arrays.toString(dest));
    }
}
