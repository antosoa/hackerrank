package datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackStructure {
	
	public static Stack<Integer> st = new Stack<Integer>();
	
	
	public void addElementStack(Stack<Integer> s, int num) {
		
		s.push(num);
	
	}
	
	static public void removeElementStack(Stack<Integer> s) {
	    
		for(int i=0; i<=s.size(); i++)
		{
			
		System.out.print("Element pop: ");
		System.out.print("\t" + s.pop() + "\t");
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti elementi ? ");
		int i = sc.nextInt();
		System.out.println("Digita " +i+" elementi");
		for(int j = 0; j<i; j++)
		{
		  //System.out.println("inserito " +j+"° elemento");
		  int num = sc.nextInt();
		  st.addElement(num);
		}
		System.out.println("Operazione terminata...");
		System.out.println("Stack: " + st);
	    
		removeElementStack(st);
		
		sc.close();
	}

}
