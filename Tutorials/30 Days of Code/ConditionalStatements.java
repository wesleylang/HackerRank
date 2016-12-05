/**
 *
 * Name :		Lang, Wesley
 * Task :		Day #3 - Conditional Statements
 * Date : 		November 23,2016
 * Course : 	30 Days of Code
 *
 * Description: Given an integer, , perform the following conditional actions:
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 * Complete the stub code provided in your editor to print whether or not  is weird.
 * 
 */	

import java.util.*;

public class ConditionalStatements {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else if(n%2==0 && n>=2 && n<=5){
          ans = "Not Weird";
      }
      else if(n%2==0 && n>=6 && n<=20){
          ans = "Weird";
      }
      else{
    	  ans = "Not Weird";
      }
      System.out.println(ans);
   }
}