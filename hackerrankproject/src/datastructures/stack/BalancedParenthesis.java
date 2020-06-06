package datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
	 
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            char[] stringToCharArray = input.toCharArray();
            Stack<Character> stack = new Stack<Character>();
            
          for (int i = 0; i < stringToCharArray.length; i++)
            {
            char current = stringToCharArray[i];
           
            if (current == '{' || current == '(' || current == '[')
            {
            stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']')
            {
            if(stack.isEmpty())
            {
            stack.push(current);
            break;
            }
            
            char last = stack.peek();
            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') 
            stack.pop();
            }
            }

            System.out.println(stack.isEmpty());
        }
         
        
}

}
