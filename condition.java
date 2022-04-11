import java.io.*;
import java.lang.*;
import java.util.*;

//Using The ConditionalOperator Concept To Find the Smaller Value

class condition
{
 public static void main(String args[])
{
  int a,b,c;
  Scanner s = new Scanner(System.in);
  System.out.println("ENTER THE VALUE FOR A :");
  a= s.nextInt();
  System.out.println("ENTER THE VALUE FOR B :");
  b= s.nextInt();
  c=a<b? a:b;
  System.out.println("THE SMALLER VALUE IS "+c);	
} 
}  


//OUTPUT :
//F:\10.4.2022>java condition.java
//ENTER THE VALUE FOR A :
//10
//ENTER THE VALUE FOR B :
//8
//THE SMALLER VALUE IS 8

