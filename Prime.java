// Created By Rajanish Bhagat

/*Prime no : 2,3,5,7,11,13,17 { Divided by only 1 and self, not divide by any another number}
Algo :  number(no)=11
1. int no/2 => 11/5 => 5 (because we use integer so value is 5 ){ Reason for dividing by 2 => because any number can be dividual by their half or less not more )
2. 11/2,3,4,5   (now we are dividing from all the number from 2 to 5 }
*/

//Prime Number Program in Java

package basiccodespack;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
				
      Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt(); 
	  
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; i++) 
      {
	      if (num % i == 0)              // condition for nonprime number
        {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}



//Find prime numbers between two numbers 

package basiccodespack;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
	    int startnum= sc.nextInt();
	    int lastnum = sc.nextInt();
	    
	   for(int num=startnum; num<=lastnum; num++)
	   {
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; i++) {
	      
	      if (num % i == 0)   // condition for nonprime number
	      {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  } 
  
}

}

