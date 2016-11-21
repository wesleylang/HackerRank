/**
 *
 * Name :		Lang, Wesley
 * Task :		Simple Array Sum
 * Date : 		November 20,2016
 * Course : 	Algorithms - Warmup
 * Description: Given an array of N integers, can you find the sum of its elements?
 * 
 */	

import java.util.*;

public class SimpleArraySum {
	
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += scan.nextInt();
        }
        scan.close();
        System.out.println(sum);
    }
	
}
