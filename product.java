import java.io.*;
import java.util.Scanner;
class product
{
	int pcode;
	String pname;
	int price;
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);

	product obj=new product();
	product obj1=new product();
	product obj2=new product();	
	
	System.out.println("Enter product 1 code:");
	System.out.print("pcode: ");	
	obj.pcode=sc.nextInt();
	sc.nextLine();
	
	System.out.print("pname: ");	
	obj.pname=sc.nextLine();
	
	System.out.print("price: ");	
	obj.price=sc.nextInt();
	
	System.out.println("Enter product 2 code:");
	System.out.print("pcode: ");	
	obj1.pcode=sc.nextInt();
	sc.nextLine();
	
	System.out.print("pname: ");	
	obj1.pname=sc.nextLine();
	
	System.out.print("price: ");	
	obj1.price=sc.nextInt();
	
	System.out.println("Enter product 3 code:");
	System.out.print("pcode: ");	
	obj2.pcode=sc.nextInt();
	sc.nextLine();
	
	System.out.print("pname: ");	
	obj2.pname=sc.nextLine();
	
	System.out.print("price: ");	
	obj2.price=sc.nextInt();
	
	product lowest=obj;
	if(obj1.price<lowest.price)
		lowest=obj1;
	if(obj2.price<lowest.price)
		lowest=obj2;
	
	System.out.println("Product with lowest price:");
	System.out.println("code: "+lowest.pcode);
	System.out.println("name: "+lowest.pname);
	System.out.println("price: "+lowest.price);
	
	sc.close();
	}
}
