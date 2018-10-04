//Java date and time program: Java code to print or display current system date and time. We are using GregorianCalendar class in our program. Don't use Date and Time classes of java.util package as their methods are deprecated, i.e., they may not be supported in the future versions of JDK. As an alternative of GregorianCalendar class you can use Calendar class.


import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
     
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
     
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}      
