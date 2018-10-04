// Created By Rajanish Bhagat

import java.util.Scanner;

class ReverseNumber

{

public static void main(String args[])

{

int n, rem,  rev = 0;

System.out.println("Enter the number to reverse ");

Scanner sct = new Scanner(System.in);

n = sct.nextInt(); //User Input

while( n != 0 )// Reversing a Number Entered

{

rem = n%10;

rev = rev * 10 + rem;

n = n/10;

}

System.out.println("Reverse of entered number is "+rev);

}

}
