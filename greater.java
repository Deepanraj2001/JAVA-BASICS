import java.io.*;
import java.lang.*;
import java.util.*;

//Using The Nested if Concept 

class greater
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner s = new Scanner(System.in);
  System.out.println("ENTER THE VALUE OF A :");
  a=s.nextInt();
  System.out.println("ENTER THE VALUE OF B :");
  b=s.nextInt();
  System.out.println("ENTER THE VALUE OF C :");
  c=s.nextInt();
//------------------------------------------------------
  if(a>b&&a>c)
  System.out.println("A IS HIGHER");
  else if(b>a&&b>c)
  System.out.println("B IS HIGHER");
  else
  System.out.println("c IS HIGHER");
 }
} 






//OUTPUT :

//F:\10.4.2022>javac greater.java

//F:\10.4.2022>java greater.java
//ENTER THE VALUE OF A :
//10
//ENTER THE VALUE OF B :
//45
//ENTER THE VALUE OF C :
//86
//c IS HIGHER  