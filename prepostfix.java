import java.io.*;
import java.lang.*;
import java.util.*;
 
class prepostfix
{
 public static void main(String arg[])
 {
  int x=20;
  System.out.println("------POSTINCREMENT------");
  System.out.println("Initial Value of X is :"+x);
  System.out.println("X value in print :"+x++);
  System.out.println("After postincrement X is :"+x);
  
  System.out.println("-----------------------------------------");
  x=10;
   System.out.println("------PREINCREMENT------");
  System.out.println("Initial Value of X is :"+x);
  System.out.println("X value in print :"+ ++x);
  System.out.println("After preincrementX:"+x);
  }
}