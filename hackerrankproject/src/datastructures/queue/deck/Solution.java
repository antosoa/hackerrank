package datastructures.queue.deck;

/*
*In this problem, you are given N  integers.
* You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.
*/
import java.util.*;
  
    public class Solution {

      public static int numberOfUniqueIntegers(ArrayDeque<Integer> deck,int n, int m)
   {
   
       ArrayList<Integer> list = new ArrayList<>();

    for(int i = 0, j= m; i<=(n-m+1); i++, j--)
    {    
      ArrayDeque<Integer> clone = deck.clone();
      for(int k=j; k>=0; k--)
      {
          clone.removeLast();
      } 
      for(int z=1; z<i; z++)
      {
          clone.removeFirst();
      } 
      list.add((int) clone.stream().distinct().count());
     }        
    return  Collections.max(list);
   }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
            }
            int res = numberOfUniqueIntegers(deque,n, m);
            System.out.println(res);
        }
    }



