import java.util.*;
public class Main 
{
	public static void main (String [] args){
	//Evaluate Reverse Polish Notation  

		// contains() used with a string: 
		String operators = "+-*/";
		String target = "+";
		if(operators.contains(target))
		{
			System.out.println(target + " is in " + operators);
		}
		else
		{
			System.out.println(target + " is not in " + operators);
		}
		
		//statement below prints a space
		System.out.println();

		//valueOf used with Integer and String 
		Stack<String> stack = new Stack<String>();
		String [] a = {"2", "4", "5", "6"};

		//prints 2 - 6 delimited by \n
		for(String i : a)
		{
			int x = Integer.valueOf(i);
			System.out.println(x + "\n");
			stack.push(String.valueOf(x));
		}
		
		System.out.println();		

		//traverse stack by using iterator internally - output same as above for loop
		for(String item : stack)
		{
			System.out.println(item + "\n");
		}

	//Random Problem 1
		
		//How to fill up a map with frequencies
	
	//Random Problem 2
		
		//toCharArray used with String 
		
			
		
	}


}