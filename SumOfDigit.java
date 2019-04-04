// Created By Rajanish Bhagat

import java.util.Scanner;

class SumOfDigit
{
public static void main(String args[])
{

int n, rem,  sum = 0;

System.out.println("Enter the  number ");
Scanner sct = new Scanner(System.in);
n = sct.nextInt(); //User Input

while( n != 0 )// check number should not equal to zero
{
rem = n%10;
sum = sum + rem;
n = n/10;
}

System.out.println("Sum of the digit is  "+sum);
}
}

/*
rajanish@netstorm-TECRA-C50-C:~/Rajanish/InfoBase/java$ java SumOfDigit
Enter the  number 
123
Sum of the digit is  6
*/
