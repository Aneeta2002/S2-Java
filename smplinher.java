import java.util.Scanner;
class employee{
int id ,salary;
String name,address;

employee(int id,String name,int salary,String address){
this.id=id;
this.name=name;
this.salary=salary;
this.address=address;
}
}
class teacher extends employee{
String dept,subject;
teacher(int id,String name,int salary,String address,String dept,String subject){
super(id,name,salary,address);
this.dept=dept;
this.subject=subject;
}
void display(){
System.out.println("\nID:"+id);
System.out.println("\nName:"+name);
System.out.println("\nSalay:"+salary);
System.out.println("\nAddress:"+address);
System.out.println("\nDepartment:"+dept);
System.out.println("\nSubject:"+subject);
}
}
public class smplinher{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of teachers:");
int n=sc.nextInt();
sc.nextLine();

teacher[] t=new teacher[n];

for(int i=0;i<n;i++){
System.out.println("\nteacher"+(i+1));
System.out.println("ID:");
int id=sc.nextInt();
sc.nextLine();

System.out.println("Name:");
String name=sc.nextLine();

System.out.println("salary:");
int salary=sc.nextInt();
sc.nextLine();

System.out.println("Address:");
String address=sc.nextLine();

System.out.println("Department:");
String dept=sc.nextLine();

System.out.println("Subject:");
String subject=sc.nextLine();

t[i]=new teacher(id,name,salary,address,dept,subject);
}
System.out.println("\nEnter ID to search:");
int search=sc.nextInt();

for(teacher teacher:t){
if(teacher.id==search){
teacher.display();
sc.close();
return;
}
}
System.out.println("Employee not found:");
sc.close();
}
}
