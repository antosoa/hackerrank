import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
A manufacturer of metal pistons finds that, on average,  
12 % of the pistons they manufacture are rejected because they are incorrectly sized. 
What is the probability that a batch of 10 pistons will contain:

No more than  rejects?
At least  rejects?
 
 */


public class Solution {

private static DecimalFormat df = new DecimalFormat("0.000");

 public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static double[] binomialDistribution(double p, int num){
         int difettosi = 2;  
          double[] arr = new double[2];
          arr[0] = 0;
          arr[1] = 0;
         p = 1 - p/100;
         df.format(p);
         for (int i=0; i<num-difettosi; i++)
         {
            double fDensita = 
            factorial(10)/(factorial(i)*factorial(10-i))*Math.pow(p,i)*Math.pow(1-p,10-i); 
            arr[0]+=fDensita;
         }
         for (int i=0; i<=num-difettosi; i++)
         {
            double fDensita = 
            factorial(10)/(factorial(i)*factorial(10-i))*Math.pow(p,i)*Math.pow(1-p,10-i); 
            arr[1]+=fDensita;
         }

         df.format(arr[0]);
         arr[0] = 1 - arr[0];
        
        return arr;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        int batch = sc.nextInt();

       
        System.out.println(df.format(binomialDistribution(p, batch)[0]));
        System.out.println(df.format(binomialDistribution(p, batch)[1]));
    }
}
