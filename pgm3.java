class A{
    A(){
        this(100);javac 
        System.out.println("A()");

    }
    A(int a){
        this(2, 4);
        System.out.println("A(int a)");
    }
    A(int b, int a){
        this(g, 4);
        System.out.println("A(int a,int b)");
    }
    A(String b,int a){
        System.out.println("A(String a, int b)");
    }

}
//same const name+diff param+multiple times in same class is constructor overloading

public class pgm3 {
    public static void main(String[] args) {
        A a=new A();
        // A a1=new A(100);
        // A a2=new A(12,23);
        // A a3=new A("abc",32);
    }
}
