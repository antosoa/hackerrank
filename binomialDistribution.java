import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*The ratio of boys to girls for babies born in Russia is . If there is  child born per birth, what proportion of 

Russian families with exactly  children will have at least  boys?

Write a program to compute the answer using the above parameters. Then print your result, rounded to 

a scale of  decimal places (i.e., #.### format).

Input Format

A single line containing the following values:

1.09 1
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

    public static double binomialDistribution(double boyToGirl, int num){
         double res = 0;  
         //(double)Math.round(value * 100000d) / 100000d
         double p =boyToGirl/(1+boyToGirl);
         df.format(p);
         double fRipartizione0 = Math.pow(1-p, 6);
         double fRipartizione1 = factorial(6)/factorial(5)*p*Math.pow(1-p,5);
         double fRipartizione2 = factorial(6)/(factorial(2)*factorial(4))*Math.pow(p,2)           *Math.pow(1-p,4);
         df.format(fRipartizione1);
         df.format(fRipartizione2);
         df.format(fRipartizione0);
         res = 1 - fRipartizione1 - fRipartizione2 - fRipartizione0;
         df.format(res);
         return res;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double boyToGirl = 1.09;
        double p = boyToGirl/(1+boyToGirl);
        int numberChild = 1;
        
        System.out.println(df.format(binomialDistribution(boyToGirl, numberChild)));
    }
}
