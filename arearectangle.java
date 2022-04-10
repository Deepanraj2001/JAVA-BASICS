import java.io.*;
import java.lang.*;
import java.util.*;

class arearectangle
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner d = new Scanner(System.in);
  System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANGLE");
  a= d.nextInt();
  b= d.nextInt();
  c=(a*b)2;
  System.out.println("THE AREA OF THE RECTANGLE IS :"+c);
 }
}