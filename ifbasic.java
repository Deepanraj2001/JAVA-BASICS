import java.io.*;
import java.lang.*;
import java.util.*;

//Using The Nested if Concept 

class ifbasic
{
 public static void main(String args[])
{
 int a;
 Scanner d =new Scanner(System.in);
  System.out.println("ENTER THE VALUE OF A  :");

 a=d.nextInt();
 //TO FINE THE VALUE IS LESSER OR HIGHER THAN 20 
  if(a>20)
   System.out.println("THE VALUE OF A IS HIGHER THAN 20");

   else if(a==20) 
   System.out.println("THE VALUE OF A IS EQUAL TO 20");

   else  
    System.out.println("THE VALUE OF A IS LESSER THAN 20");
   
}
}   





//OUTPUT :
//F:\10.4.2022>javac ifbasic.java

//F:\10.4.2022>java ifbasic.java
//ENTER THE VALUE OF A  :
//20
//THE VALUE OF A IS EQUAL TO 20

//F:\10.4.2022>java ifbasic.java
//ENTER THE VALUE OF A  :
//8
//THE VALUE OF A IS LESSER THAN 20

//F:\10.4.2022>java ifbasic.java
//ENTER THE VALUE OF A  :
//45
//THE VALUE OF A IS HIGHER THAN 20

 