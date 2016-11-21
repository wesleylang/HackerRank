/**
 *
 * Name :		Lang, Wesley
 * Task :		Time Complexity: Primality
 * Date : 		November 20,2016
 * Course : 	Cracking the Coding Interview
 * Description: Check whether or not a number is prime and try to do so with an O(sqrt(n)) primality algorithm.
 * 
 */	


import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        for(int i= 0; i < p; i++)
        {
            int n = scan.nextInt();
            if(n==1) System.out.println("Not prime");
            else 
            {
                boolean check=true;
                int l = (int)Math.sqrt(n);
                for(int j = 2; j <= l; ++j) 
                    if(n%j==0)
                    {
                        check=false; 
                        j=n;
                    }
                if(check) System.out.println("Prime");
                else System.out.println("Not prime");
            }
        }
        scan.close();
    }   
}
