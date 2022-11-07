import java.io.*;
import java.util.*;
class Employee{
String name;
int age;
long phone;
String address;
double salary;
double print_salary()
{
return salary;
}
}
class Officer extends Employee{
String specialization;
}
class Manager extends Employee{
String department;
}
class employee{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Officer off=new Officer();
Manager man=new Manager();
System.out.println("----Enter details of officer:----");
System.out.print("Enter Name:");
off.name=s.nextLine();
System.out.print("Enter Age:");
off.age=s.nextInt();
System.out.print("Enter phone number:");
off.phone=s.nextLong();
s.nextLine();
System.out.print("Enter Address:");
off.address=s.nextLine();
System.out.print("Enter Specialization:");
off.specialization=s.nextLine();
System.out.print("Enter Salary:");
off.salary=s.nextDouble();

System.out.println("\n----Details of officer:----");
System.out.print("\nName:" +off.name);
System.out.print("\nAge:" +off.age);
System.out.print("\nEnter phone number:" +off.phone);
System.out.print("\nEnter Address:" +off.address);
System.out.print("\nEnter Specialization:" +off.specialization);
System.out.print("\nEnter Salary:" +off.print_salary());

System.out.println("\n----Enter details of Manager:----");
s.nextLine();
System.out.print("Enter Name:");
man.name=s.nextLine();
System.out.print("Enter Age:");
man.age=s.nextInt();
System.out.print("Enter phone number:");
man.phone=s.nextLong();
s.nextLine();
System.out.print("Enter Address:");
man.address=s.nextLine();
System.out.print("Enter department:");
man.department=s.nextLine();
System.out.print("Enter Salary:");
man.salary=s.nextDouble();

System.out.println("\n----Details of manager:----");
System.out.print("\nName:" +man.name);
System.out.print("\nAge:" +man.age);
System.out.print("\nEnter phone number:" +man.phone);
System.out.print("\nEnter Address:" +man.address);
System.out.print("\nEnter Department:" +man.department);
System.out.print("\nEnter Salary:" +man.print_salary());

}
}
