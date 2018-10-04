//Java while loop is used to execute statement(s) until a condition is true.
/*
while loop syntax:

while (condition(s)) {
// Body of loop
}

>> If the condition(s) holds true then the body of the loop is executed, after execution of the loop body condition is tested again and if the condition is still true then the body of the loop is executed again, and the process repeats until the condition(s) becomes false. The condition evaluates to true or false and if it is a constant, for example, while (c) {…}, where c is a constant, then any non zero value of c is considered to be true, and zero is considered false.

>> You can test multiple conditions such as

while (a > b && c != 0) {
 // Loop body
}

Loop body is executed till value of variable a is greater than value of variable b and variable c isn't equal to zero.

A body of a loop can contain more than one statement. For multiple statements, you need to place them in a block using {}, and if the body of a loop contains only one statement, you can optionally use {}. It is always recommended to use braces to make your program easy to read and understand.

*/

//Following program asks a user to input an integer and prints it until the user enter 0 (zero).

import java.util.Scanner;
 
class WhileLoop {
  public static void main(String[] args) {
    int n;
   
    Scanner input = new Scanner(System.in);
    System.out.println("Input an integer");
   
    while ((n = input.nextInt()) != 0) {
      System.out.println("You entered " + n);
      System.out.println("Input an integer");
    }
   
    System.out.println("Out of loop");
  }
}

/*
// We can write above program using a break statement. We test a user input and if it is zero then we use "break" to exit or come out of the loop.

import java.util.Scanner;
 
class BreakWhileLoop {
  public static void main(String[] args) {
    int n;
   
    Scanner input = new Scanner(System.in);
   
    while (true) { // Condition in while loop is always true here
      System.out.println("Input an integer");
      n = input.nextInt();
     
      if (n == 0) {
        break;
      }
      System.out.println("You entered " + n);
    }
  }
}
*/


/*
//Java while loop break continue program

import java.util.Scanner;
 
class BreakContinueWhileLoop {
  public static void main(String[] args) {
    int n;
   
    Scanner input = new Scanner(System.in);
   
    while (true) {
      System.out.println("Input an integer");
      n = input.nextInt();
     
      if (n != 0) {
        System.out.println("You entered " + n);
        continue;
      }
      else {
        break;
      }
    }
  }
}
*/
