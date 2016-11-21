/**
 *
 * Name :		Lang, Wesley
 * Task :		Arrays: Left Rotation
 * Date : 		November 20,2016
 * Course : 	Cracking the Coding Interview
 *
 * Description: A left rotation operation on an array of size  shifts each of the array's elements 1 unit to the left. For example, 
 * 			if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2]. Given an array 
 * 			of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of 
 * 			space-separated integers.
 */	

import java.util.*;

public class LeftRotation {
	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int array[] = new int[n];
        int[] getArray = new int[n];
        for (int i = 0; i < n; i++) {
        	//assigned input to array at index i
            getArray[i] = in.nextInt(); 
        }
        for (int i = 0; i < n; i++) {
        	//'d' left rotations equal (n-d) right rotations.
        	//Array of size n, so when index(i+n-d) is equal to n, index goes to starting index.
        	//mod to get the correct index where we want to assign the element when the index is larger than n
            array[(i + n - k) % n] = getArray [i]; 
        }
        
        in.close();
        
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }      
        System.out.println();
        
    }
}
