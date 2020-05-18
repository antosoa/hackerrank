import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// The probability that a machine produces a defective product is 1/3 .
//What is the probability that the 1st defect is found during the 5th inspection?
// manual input 1 3 (defect probability) 5


public class Solution {
    
     private static DecimalFormat df = new DecimalFormat("0.000");

    public static double geometricDistribution(double q, int n)
    {
     //g(n,p) = q^(n-1)*p
     double p = 1 -q;
     double res = 0;
     res = q*Math.pow(p, n -1);    
     return res;
    }

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double prob = sc.nextInt();
        prob = prob/sc.nextInt();
        int firstdefect = sc.nextInt();

        System.out.println(df.format(geometricDistribution(prob, firstdefect)));
    }
}
