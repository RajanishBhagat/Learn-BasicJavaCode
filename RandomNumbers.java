// Created By Rajanish Bhagat

/* Java program to generate random numbers: This code generates random numbers in range 0 to 100 (both inclusive). */

import java.util.*;
 
class RandomNumbers {
  public static void main(String[] args) {
    int c;
    Random t = new Random();
 
    // random integers in [0, 100]
 
    for (c = 1; c <= 10; c++) {
      System.out.println(t.nextInt(100));
    }
  }
}
