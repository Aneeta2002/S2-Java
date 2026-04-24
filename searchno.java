import java.util.Scanner;
class searchno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int len=sc.nextInt();
int a[]=new int[len];
System.out.println("Enter the array elements:");
for(int i=0;i<len;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the elemnets to be search");
int s=sc.nextInt();
int pos=-1;
for(int i=0;i<len;i++)
{
if(a[i]==s)
{
pos=i;
break;
}
}
if(pos==-1)
{
System.out.println("Elemnets not found");
}
else
{
System.out.println("Elements found at index:"+pos);
}
sc.close();
}
}
