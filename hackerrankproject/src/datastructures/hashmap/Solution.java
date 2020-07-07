package datastructures.hashmap;

 
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
      List<String> queries = new ArrayList<String>();
      Map<String,Integer> phoneBook = new HashMap<String,Integer>();
		
      Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
          phoneBook.put(name, phone);
		}

      //aggiungo query alla lista
		while(in.hasNext())
		{
			String s=in.nextLine();
		    queries.add(s);
      }

     // System.out.println(phoneBook.get("ciao") == null);
      Set<String> keys = phoneBook.keySet();

      for(String s : queries)
      {   
          if(keys.contains(s) == false)
          System.out.println("Not found");
          else
          System.out.println(s+"="+phoneBook.get(s));
      }
	}
}



