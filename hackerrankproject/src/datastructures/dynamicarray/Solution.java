package datastructures.dynamicarray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */
   
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
    Integer lastAnswer = 0;
    //Integer size = queries.get(0).size();
    List<Integer> res = new ArrayList<>();
    List<List<Integer>> seqList = new ArrayList<>();
    for (int i=0; i<n; i++)
    {
        seqList.add(new ArrayList<Integer>());
    }

    for (int i=0; i<queries.size(); i++)
    {
        if(queries.get(i).get(0) == 1)
        {
            
            Integer y = queries.get(i).get(2);
            seqList.get((queries.get(i).get(1)^lastAnswer)%n).add(y);

        } else
        {
          Integer size = seqList.get((queries.get(i).get(1)^lastAnswer)%n).size();
          lastAnswer = seqList.get((queries.get(i).get(1)^lastAnswer)%n).get(queries.get(i).get(2) % size);
          res.add(lastAnswer);
        }
    }
      return res;
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }
        
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
