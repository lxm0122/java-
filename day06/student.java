package day06;

public class student {
    private int age=10;
    static int money;//静态全局变量，
    static {
        //只加载一次 只执行一次
        //给类的静态成员变量初始化
        //可以有多个静态代码块，但多个没意义
        //在静态代码块中不能直接使用普通成员变量和成员方法
        money=10000;
    }
    public int getAge(){
        int getage=age;
        return getage;
    }
    public void setAge(int age){
        this.age=age;
    }
}

class xiaoming extends student{
    void spend(int m){
        xiaoming.money-=m;
    }
}
