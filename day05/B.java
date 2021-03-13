package day05;

public class B extends A{
    private String nameB="B";
    public void getname(){
        System.out.println("子类"+nameB);
        super.getname();
    }
}
