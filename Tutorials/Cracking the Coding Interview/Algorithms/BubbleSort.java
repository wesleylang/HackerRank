/**
 *
 * Name :		Lang, Wesley
 * Task :		Arrays: Left Rotation
 * Date : 		November 20,2016
 * Course : 	Cracking the Coding Interview
 * Description: Given an n-element array of distinct elements, sort array A in ascending order using the Bubble Sort algorithm above. 
 * 				Once sorted, print the following three lines: 
 * 					1. Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * 					2. First Element: firstElement, where  is the first element in the sorted array.
 * 					3. Last Element: lastElement, where  is the last element in the sorted array.
 * 
 */	

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int array[] = new int[n];
    	
    	 for(int a_i=0; a_i < n; a_i++){
             array[a_i] = scan.nextInt();
         }
    	 
    	 scan.close();
         
         int totalSwaps = 0;
         int size = array.length;
  
         for(int i=0;i<array.length;i++){
             int numberOfSwaps = 0;
             
             for(int j=0;j<size-1;j++){
                 int temp = 0;
                 if(array[j]>array[j+1]){
                     
                     temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                     numberOfSwaps++;
                 }              
             }
             if(numberOfSwaps==0)
                 break;
             totalSwaps += numberOfSwaps;
             //Optimization. No need to carry out 2nd loop till n-1 everytime.
             size--;         
         }
         System.out.println("Array is sorted in "+totalSwaps +" swaps.");
         System.out.println("First Element: "+array[0]);
         System.out.println("Last Element: "+array[array.length-1]);
         
    }
}
