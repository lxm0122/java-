package day05;

import javafx.scene.shape.Circle;

public class Demo02 {
    public static void main(String[] args) {
        Circle[] circle = new Circle[10];
        for (int i=0;i<10;i++){
            double radius=(Math.random()*15+5);
            double a=circle[i].Area(radius);
            System.out.println("面积"+i+"："+a);
        }
    }

    public class Circle {
        double[] circle=new double[10];
        public Circle(double radius) {
        }

        public double Area(double r) {
            double area = r * r * 3.1415926;
            return area;
        }

        public double Circumference(double r) {
            double circumference = 2 * 3.1415926 * r;
            return circumference;
        }
    }
}
