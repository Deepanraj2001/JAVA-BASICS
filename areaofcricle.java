import java.io.*;
import java.lang.*;
import java.util.*;

class areaofcricle
{
 public static void main(String args[])
 {
  double a,c;
  Scanner d = new Scanner(System.in);
  System.out.println("ENTER THE RADIUS OF THE CIRCLE");
  a= d.nextFloat();
  c=(22*a*a)/7;
  System.out.println("THE AREA OF THE CIRCLE IS :"+c);
 }
}