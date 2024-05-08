import java.util.Scanner;

class Emp {
    String name;
    int id;
    int Age;
    String dg ;
    double Salary ;

    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter ID");
        id = sc.nextInt();
        System.out.println("Enter Age");
        Age = sc.nextInt();
    }
    void display() {
        System.out.println("My name is:" + name);
        System.out.println("My Id is:" + id);
        System.out.println("My Salary is:" + Salary);
        System.out.println("My Age is:" + Age);
        System.out.println("My Designation is:" + dg);
    }
    double raiseSalary(){
        
        return Salary= Salary + 0.1 * Salary;
    }
}

class Dev extends Emp {
    

    Dev() {
         dg = "Developer";
      Salary = 600000;
    }
}

class Clerk extends Emp {
    

    Clerk() {
 dg = "Clerk";
 Salary = 200000;
    }
}

public class modifiedPgm1 {
 
    public static void main(String args[]) {
        Dev d=null;
  Clerk c=null;
  
        Scanner sc = new Scanner(System.in);
        int ch = 0;
int ch1=0;
do{
    System.out.println("1) Create");
    System.out.println("2) Display");
    System.out.println("3) Raise Salary");
    System.out.println("4) Exit");
    ch1 = sc.nextInt();
    if (ch1 == 1) {
        do{
            System.out.println("1) Dev");
            System.out.println("2) Clerk");
            ch = sc.nextInt();
        if (ch == 1) {
             d = new Dev();
        }
        if (ch == 2) {
             c = new Clerk();
        }
    } while (ch != 3);
    }
    if (ch1 == 2) {
        if(d!=null){
        d.display();
        }
        if(c!=null){
        c.display();
        }
    }
    if (ch1 == 3) {
        if(d!=null){
            System.out.println( d.raiseSalary());
        }
        if(c!=null){
            System.out.println( c.raiseSalary());
            }
    }
}
while(ch1!=5);
        

    }
}
