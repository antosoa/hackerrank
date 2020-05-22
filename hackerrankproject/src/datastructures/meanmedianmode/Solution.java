package datastructures.meanmedianmode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



  private static double mean(Integer []a){
    
    double sum = 0;
    for(int i = 0; i<a.length; i++)
    {
        sum+=a[i];
    }
    return sum/(a.length);

  }

  private static double median(Integer []a){
   Arrays.sort(a);
   if(a.length%2 == 0)
   {
   int l = a.length/2;
   double value = a[l-1] + a[l];
   return value/2;
   }else
   {
       return (double) a[a.length/2];
   }
  } 

  public static Integer mode(Integer []a){
    Integer resul = 0;
    HashMap<Integer,Integer> hz = new HashMap<Integer,Integer>();
    
    List<Integer> asList = Arrays.asList(a);
    Collections.sort(asList);

    for(Integer i: asList){

     hz.put(i, Collections.frequency(asList,i));

    }

     if ( Collections.frequency(hz.values(),Collections.max(hz.values())) == 1) 
     { 
 //torno la chiave corrispondente al val max
           
     for(Map.Entry<Integer, Integer> pair: hz.entrySet())
     {
     if(pair.getValue() == Collections.max(hz.values())) 
      resul = pair.getKey();
       }  
            
      } else 
      {
      List<Integer> list2 = new ArrayList<Integer>();
      for(Map.Entry<Integer, Integer> pair: hz.entrySet())
      {
      if(pair.getValue() == Collections.max(hz.values()))
         {
         Integer i = pair.getKey();    
          list2.add(i);
          }
       }  
      resul = Collections.min(list2);
       }

    return resul;
  }
  

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Lunghezza array: " + (6%3) + "  " + 5%3 + "   " + 4%3 );
        int number = sc.nextInt();
        Integer[] arr = new Integer[number];
        for (int i = 0; i<arr.length; i++)
        {
        	System.out.print("elemento arr["+i +"] :");
        	System.out.println();
            arr[i] = Integer.valueOf(sc.nextInt());
        }
        
        sc.close();
        
        System.out.println(mean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
    }
}
