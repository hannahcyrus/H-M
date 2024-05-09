final class A{
    int site =5;
    int money=30000;
    String car="BENZ";
    final int speed=200;
    final void gear(){
        System.out.println("5");
    }
}
class B extends A{
    void gear(){
        System.out.println("8");
    }
}
public class finalPgm {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        System.out.println(b.speed);//it cant extend the parent class as its final
       // b.speed=2000; we cannot change value as its final
       b.gear();
    }
}
