import java.io.*;
import java.lang.*;
import java.util.*;

//Using The Switch Concept To Perform Multiple Arithmatic Operation In a Program  

class SwitchDemo
{
 public static void main(String args[])
{
  int a,b,c;
  Scanner s = new Scanner(System.in);
  System.out.println("ENTER THE VALUE FOR A :");
  a=s.nextInt();
  System.out.println("ENTER THE VALUE FOR B :");
  b=s.nextInt();
  System.out.println("|1='SUM'|----|2='DIFFERENCE'|----|3='PRODUCT'|----|4='QUOTIENT'|");
  System.out.println("ENTER THE VALUE TO BE PERFORMED");
  c=s.nextInt(); 
  switch(c)
  { 
   case'1':
   System.out.println("THE SUM OF A AND B IS :"+(a+b));
   break;

   case'2':
   System.out.println("THE DIFFERENCE OF A AND B IS :"+(a-b));
   break;

   case'3':
   System.out.println("THE PRODUCT OF A AND B IS :"+(a*b));
   break;

   case'4':
   System.out.println("THE QUOTIENT OF A AND B IS :"+(a/b));
   break;

   default:
   System.out.println("INVAILD CHOICE");   
  }
}
} 

   