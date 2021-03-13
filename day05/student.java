package day05;

public class student extends person {

    double score;
    public student(String name,String subject){
        super(name);
        study(name,subject);
    }
    public void study(String name,String subject){
        System.out.println(name+"学的是"+subject);
    }
}
