/**
 *
 * Name :		Lang, Wesley
 * Task :		Day #1 - Data Types
 * Date : 		November 21,2016
 * Course : 	30 Days of Code
 *
 * Description: Declare 3 variables of type int, double, and string. Then read 3 lines of input from
 * 					stdin and initialize your 3 variables. Then use the + operator to to get the sum
 * 					or concatenation of your values.
 * 
 */	

import java.util.*;

public class DataTypes {

	public static void main(String[] args){
		
		int i = 4;
		double d = 4.0;
		String s = "HackerRank";
		
		Scanner scan = new Scanner(System.in);
		
		int sumi = scan.nextInt();
		double sumd = scan.nextDouble();
		scan.nextLine();
		String concats = scan.nextLine();
		
		System.out.println(i + sumi);
		System.out.println(d + sumd);
		System.out.println(s + " " + concats);
		
		scan.close();
		
	}
	
}
