package day06;

public class Demo01 {
    public static void main(String[] args) {
        student student=new student();
        System.out.println("money = "+student.money);
        int getAge=student.getAge();
        System.out.println(getAge);
        student.setAge(20);
        getAge=student.getAge();
        System.out.println(getAge);
        xiaoming xiaoming=new xiaoming();
        xiaoming.spend(200);
        System.out.println(xiaoming.money);
        System.out.println(student.money);
    }
}
