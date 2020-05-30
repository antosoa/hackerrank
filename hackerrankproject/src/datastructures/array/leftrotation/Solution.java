package datastructures.array.leftrotation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     public static int[] leftRotation(int[] a, int d, int n){
       
       int[] tmp = new int[d];
       for(int i=0; i<d; i++)
       {
        tmp[i]=a[i];
       }
       int[] copiedArr = a.clone();
       for(int j=0; j<a.length-d; j++)
       {
           copiedArr[j]=a[j+d];
       }
        for(int k=0; k<d; k++)
                {
                  copiedArr[a.length-d+k]=tmp[k];
                }
           return copiedArr;
       }
        


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        int[] res = leftRotation(a, d, n);
        for(int i=0; i<n; i++)
        {
            System.out.print(res[i] + " ");
        }
    }
}
