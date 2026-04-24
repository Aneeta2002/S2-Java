import java.util.*;
class arrobj
String name;
int salary;
employee(int id,String name,int salary)
{
this.id=id;
this.name=name;
this.salary=slary;
}
void display()
{
System.out.println("employee salary is "+ salary);
}
System.out.println("employee id is "+ id);
System.out.println("employee name is "+ name);
public static void main(String args[])
{
int id;
String name;
int salary;
Scanner op=new Scanner(system.in);
System.out.println("Enter the number of elemnets");
int n=op.nexrInt();
Scanner op1=new Scanner(System.in);
Scanner op2=new scanner(system.in);
employee arr[]=new employee[n];
for(int i=0;i<n;i++)
[
System.out.println("Enter "+(i+1)+" employee details:");
System.out.println("Enter employee id :");
id=op1.nextInt();
System.out.println("Enter employee name :");
name=op2.nextLine();
System.out.println("Enter employee salary :");
salary=op1.nextInt();
arr[i]=new employee(id,name,salary);
}
boolean flag=false;
System.out.println("Enter the id of any employe to search");
int eid=op.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i].id==eid)
{
arr[i].display();
flag=true;
}
if(flag==false)
{
System.out.println("ID not found");
}
}
}
