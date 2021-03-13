package day04;


public class round {
    public round(double radius) {
        Area(radius);
        Circumference(radius);
    }
    public static void Area(double r){
        double area=r*r*3.1415926;
        System.out.println("圆的面积："+area);
    }
    public static void Circumference(double r){
        double circumference=2*3.1415926*r;
        System.out.println("圆的周长"+circumference);
    }

}
