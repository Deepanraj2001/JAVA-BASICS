import java.io.*;
import java.lang.*;
import java.util.*;

//Using The FORLOOP Concept 

class factorial
{
 public static void main(String args[])
 {
  int a=1;
  for(int i=1;i<=10;i++)
  {
   a*=i;
   System.out.println(i+"Factorial is : "+a);
  }  
 }
}



//OUTPUT :

F:\10.4.2022>javac factorial.java

F:\10.4.2022>java factorial.java
1Factorial is : 1
2Factorial is : 2
3Factorial is : 6
4Factorial is : 24
5Factorial is : 120
6Factorial is : 720
7Factorial is : 5040
8Factorial is : 40320
9Factorial is : 362880
10Factorial is : 3628800
	