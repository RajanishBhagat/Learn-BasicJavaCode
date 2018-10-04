
/*Prime no : 2,3,5,7,11,13,17 { Divided by only 1 and self, not divide by any another number}
Algo :  number(no)=11
1. int no/2 => 11/5 => 5 (because we use integer so value is 5 ){ Reason for dividing by 2 => because any number can be dividual by their half or less not more )
2. 11/2,3,4,5   (now we are dividing from all the number from 2 to 5 }
*/

import java.util.*;
public class Prime {

    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Please Enter a number");
     
        int num = in.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
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
