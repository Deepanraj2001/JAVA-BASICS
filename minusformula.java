import java.io.*;
import java.lang.*;
import java.util.*;

class minusformula
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner d = new Scanner(System.in);
  System.out.println("ENTER THE A AND B OF RECTANGLE");
  a= d.nextInt();
  b= d.nextInt();
  c= a*a+b*b-2*a*b;
  System.out.println("THE VALUE OF (a-b)^2 IS :"+c);
 }
}