abstract class Bank{
    abstract void aTM();
    abstract void kYC();
}
class SBI extends Bank{
    void aTM(){
        System.out.println("50000");
    }
    void kYC(){
        System.out.println("KYC");
    }
}
class Axis extends Bank{
    void aTM(){
        System.out.println("25000");
    }
    void kYC(){
        System.out.println("KYC");
    }
}
public class pgm6 {
    public static void main(String[] args) {
        
    
    SBI s=new SBI();
    s.aTM();
    s.kYC();
    Axis a=new Axis();
    a.aTM();
    a.kYC();
}
}
