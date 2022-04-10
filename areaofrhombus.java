import java.io.*;
import java.lang.*;
import java.util.*;

class areaofrhombus
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner d = new Scanner(System.in);
  System.out.println("ENTER THE DIAGONAL1 AND DIAGONAL2 OF THE RHOMBUS");
  a= d.nextInt();
  b= d.nextInt();
  c= a*b/2;
  System.out.println("THE AREA OF THE RHOMBUS IS :"+c);
 }
}