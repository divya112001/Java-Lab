import java.util.Scanner;
class Product
{
int pcode,price;
String pname;
Product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.price=price;
this.pname=pname;
}
}
public class Products
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter product code:");
int pcode=sc.nextInt();
System.out.print("\nEnter product name:");
String pname=sc.next();
System.out.print("\nEnter product price:");
int price=sc.nextInt();
Product[]ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]=new Product(101,"rice",150);
ps[2]=new Product(102,"tomato",50);
int minprice=ps[0].price;
System.out.print("\nCODE\tNAME\tPRICE");
System.out.print("\n..........................");
for(Product p:ps)
{
System.out.print("\n"+p.pcode +"\t"+ p.pname +"\t"+ p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.print("\n..........................");
System.out.println("\nlowest cost product details");
System.out.print("\n..............................");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.print("\nProduct code:" +p.pcode);
System.out.print("\nProduct name:" + p.pname);
System.out.print("\nProduct price:" + p.price);
}
}
}
}

