// Created By Rajanish Bhagat

import java.util.Scanner;

class SumOfDigit 

{

public static void main(String args[])

{

int n, rem,  sum = 0;

System.out.println("Enter the number to reverse ");

Scanner sct = new Scanner(System.in);

n = sct.nextInt(); //User Input

while( n != 0 )// Reversing a Number Entered

{

rem = n%10;

sum = sum + rem;

n = n/10;

}

System.out.println("Reverse of entered number is "+sum);

}

}
