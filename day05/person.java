package day05;

public class person {
    double age;
    String name;
    protected   person(String name){
        super();
        System.out.println(name);
        sleep();
    }
    public static void sleep(){
        System.out.println("睡觉");
    }
}
