
// Java program to demonstrate 
// asList() method for String value 
// The asList() method of java.util.Arrays class is used to return a fixed-size list backed by the specified array. 
  
import java.util.*; 
  
public class GFG1 { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // creating Arrays of String type 
            String a[] = new String[] { "A", "B", "C", "D" }; 
  
            // getting the list view of Array 
            //List<String> list = Arrays.asList(a); 
            //int list = Arrays.asList(a); 
  
            // printing the list 
            System.out.println("The list is: " + Arrays.asList(a)); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 

/*Output is like :
The list is: [A, B, C, D]
*/

//----------------------------------------------------------------------------------------------------------------------------------------//

Arrays.sort() method is used to sort the array element
/*
import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {

      int iArr[] = {2, 1, 9, 6, 4};
      for (int number : iArr) {
         System.out.println("Number = " + number);
      }

      Arrays.sort(iArr);
      System.out.println("The sorted int array is:");
      for (int number : iArr) {
         System.out.println("Number = " + number);
      }
   }
}

Output : 

Number = 2
Number = 1
Number = 9
Number = 6
Number = 4
The sorted int array is:
Number = 1
Number = 2
Number = 4
Number = 6
Number = 9
*/
