package day03;

import java.util.Arrays;

public class Job01 {
    public static void main(String[] args) {
        int redball[]=new int[5];
        for (int i=0;i<5;i++) {
            redball[i]=(int)(Math.random()*32+1);
        }
        Arrays.sort(redball);
        for (int i=1;i<5;i++){
            if (redball[i]==redball[i-1]){
                redball[i]=(int)(Math.random()*32+1);
                Arrays.sort(redball);
            }
        }
        System.out.println("红球："+ Arrays.toString(redball));
        redball=Arrays.copyOf(redball,redball.length+1);
        redball[redball.length-1]=(int)(Math.random()*16+1);
        System.out.println("双色球："+ Arrays.toString(redball));
    }
}
