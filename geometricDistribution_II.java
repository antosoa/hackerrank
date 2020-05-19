import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*The answer can be explained in (at least) two ways. One has already been said: if p=1/3 is the probability 
that a defective product is made, then q=1-p is the probability that the product is not defective. 
The question asks: what is the probability that, of the first 5 products produced, at least one is defective?
One way to answer this is to find the probability of the opposite situation occuring, i.e. 
that none of the first 5 products are defective. We don't care what happens afterwards. The probability 
that none of the first 5 are defective must be q**5, hence the probability that at least 1 is defective must be 1-q**5.
Now, another way to see this is to notice that the events described using the geometric distribution formula p*q**(n-1) 
are mutually exclusive: you cannot have 2 happening in 1 trial (you cannot discover the first defect twice).
So the probability that the first defect is found in the first 5 inspections is the probability it is found 
in inspection 1 plus the probability it is found in inspection 2 and so on up to the probaility it is found 
in inspection 5. Writing this out, we get  prob = p + p*q + p*q**2 + p*q**3 + p*q**4
Now, the right side factors as p*(1+q+q**2+q**3+q**4) and we can use the formula for geometric series 
1+q+q**2+...+q**(n-1) = (1-q**n)/(1-q) where the denominator 1-q is just p. 
So the denominator cancels, and we get prob = 1-q**n = 1-q**5 again.

*/

public class Solution {

        private static DecimalFormat df = new DecimalFormat("0.000");

    public static double geometricDistribution(double q, int n)
    {
     //g(n,p) = q^(n-1)*p
     double p = 1 -q;
     double res = 0;
     for ( int i = 1; i<=5; i++)
     res = Math.pow(p, n);    
     return 1 - res;
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
