import java.util.Scanner;
import java.util.Arrays;
class Arrayofstrings
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of string :");
int size=sc.nextInt();
String[]strings=new String[size];
System.out.println("Enter the strings :");
for(int i=0;i<size;i++)
{
strings[i]=sc.next();
}
System.out.println("choose :\n 1. Built in method\n 2. User defined method ");
System.out.println("Option :");
int opt=sc.nextInt();
switch(opt)
{
case 1:	
Arrays.sort(strings);
break;
case 2:
String temp;
for (int i=0; i<size-1; i++)
{
for (int j=i+1; j<size; j++)
{
if(strings[i].compareTo(strings[j]) >0)
{
temp=strings[i];
strings[i]=strings[j];
strings[j]=temp;
}
}
}
break;
default :
System.out.println("Invalid option");
break;
}
for (int i=0; i<size; i++)
{
System.out.println(strings[i]);
}
}
}

