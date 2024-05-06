

import java.util.Scanner;
class A{
String name;
int id;
int Age;
String dg;
float Salary;
A(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter name");
name=sc.next();
System.out.println("My name is:"+name);
System.out.println("Enter ID");
id=sc.nextInt();
System.out.println("My Id is:"+id);
System.out.println("Enter Salary");
Salary=sc.nextFloat();
System.out.println("My Salary is:"+Salary);
System.out.println("Enter Age");
Age=sc.nextInt();
System.out.println("My Age is:"+Age);
System.out.println("Enter Designation");
dg=sc.next();
System.out.println("My Designation is:"+dg);
}
}
class Demo1{ 
public static void main(String args[]){
A a=new A();
}
}

