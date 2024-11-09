//A year is a leap year if it's divisible by four, except for century years, which must be divisible by 400.
import java.util.*;
public class Leap{
   public static void main (String[]args)
   {

     
     Scanner sc=new Scanner();
     int year;
     year=sc.nextInt();
     if (year % 400 == 0)
       System.out.println (year + " is a Leap Year");

     else if (year % 4 == 0 && year % 100 != 0)
       System.out.println (year + " is a Leap Year");

     else
         System.out.println (year + " is not a Leap Year");

   }
 }
