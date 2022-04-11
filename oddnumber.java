import java.io.*;
import java.lang.*;
import java.util.*;

//TO PRINT THE ODD NUMBERS USING (WHILE LOOP)

class oddnumber
{
  public static void main(String args[])
  {
  int x=1,i=1,n;
  Scanner s = new Scanner(System.in);
  System.out.println("ENTER THE NUMBER OF ODDS NEEDED");
  n=s.nextInt();   
  while(i<=n)
  {	
  System.out.println("\t"+x);
  x=x+2;
  i++; 
  }   
  } 
} 



//OUTPUT :
//F:\10.4.2022>javac oddnumber.java

  F:\10.4.2022>java oddnumber.java
  ENTER THE NUMBER OF ODDS NEEDED
  10
       1
       3
       5
       7
       9
       11
       13
       15
       17
       19