/*
QUESTION:

In this HackerRank Java Primality Test problem in java programming 
you have Given a large integer, n, 
use the Java BigInteger class' isProbablePrime method to determine 
and print whether it's prime or not prime.
*/

//SOLUTION

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      if (n.isProbablePrime(50)) {
          System.out.println("prime");
      } else {
          System.out.println("not prime");
      }
     }
}
