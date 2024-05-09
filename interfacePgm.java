interface Company{
    void pf();
    void cab();
}
class Dev implements Company{
   public void pf(){

   }
   public void cab(){

   }
}
class Clerk implements Company{
   public void pf(){

    }
   public void cab(){

    
}




public class interfacePgm {
    public static void main(String[] args) {
        Clerk c=new Clerk();
        c.cab();
        c.pf();
    }
}
