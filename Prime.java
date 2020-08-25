// Created By Rajanish Bhagat

/*Prime no : 2,3,5,7,11,13,17 { Divided by only 1 and self, not divide by any another number}
Algo :  number(no)=11
1. int no/2 => 11/5 => 5 (because we use integer so value is 5 ){ Reason for dividing by 2 => because any number can be dividual by their half or less not more )
2. 11/2,3,4,5   (now we are dividing from all the number from 2 to 5 }
*/

//Prime Number Program in Java
package interv;

import java.util.Scanner;  
  
public class PrimeExample {  
  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " is a prime number");  
       } else {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       
       for (int i = 2; i < n/2; i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  


//Find prime numbers between two numbers 


package interv;

import java.util.Scanner;  
public class PrimeExample {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       int start = s.nextInt();  
       System.out.print("Enter the second number : ");  
       int end = s.nextInt();  
       System.out.println("List of prime numbers between " + start + " and " + end);  
       for (int i = start; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  
