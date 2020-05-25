import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//calculate the E[Ca] machine a = E[160 + 40X^2]
//   and E[Cb] machine b =  E[128 + 40Y^2]
// Identity: VAR[X] = E[X^2] - (E[X])^2

public class poissonDistribution {
    
    static final int overHeadA = 160;
    static final int overHeadB = 128;
    static final int variable = 40;
   

    public static long factorial(int number) {

        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static double poissonDistribution_(double lambda, int overHead, int variable)
    {   
        double prob = overHead + variable*(lambda+Math.pow(lambda, 2));

        return prob;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("digita lambda A: ");
        double lambdaA = sc.nextDouble();
        System.out.println("digita lambda B: ");
        double lambdaB = sc.nextDouble();
        sc.close(); 

        System.out.println(poissonDistribution_(lambdaA, overHeadA, variable));
        System.out.println(poissonDistribution_(lambdaB, overHeadB, variable));
    }
}