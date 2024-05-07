class P{
    int money=2000000;
    String Car="BMW";
    private String newCar="BENZ";
    int site=5;
    void use(){
        System.out.println("M:"+money);
        System.out.println("C:"+Car);
        System.out.println("NC:"+newCar);
        System.out.println("S:"+site);

    }
}
class C extends P{
    int money=10000;
    void use()
{
        System.out.println("M:"+money);
        System.out.println("Parent M:"+super.money);
        System.out.println("ParentC:"+Car);
        //System.out.println("NC:"+newCar);
        System.out.println("S:"+site);

}}

public class pgm2 {
    public static void main(String args[]){
        C c=new C();
        c.use();
       
    }
}
