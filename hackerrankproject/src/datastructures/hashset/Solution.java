package datastructures.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
/*
 * Sample Input
 * 5
 * john tom
 * john mary
 * john tom
 * mary anna
 * mary anna
 */


	public class Solution {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }

	        Set<String> pairs = new HashSet<String>();
	        for(int i=0; i<t; i++)
	        {
	            pairs.add(pair_left[i] + " " + pair_right[i]);
	            System.out.println(pairs.size());
	        }
	   }
	}

