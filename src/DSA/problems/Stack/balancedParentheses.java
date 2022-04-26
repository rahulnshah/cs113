package DSA.problems.Stack;

import java.util.Stack;

public class balancedParentheses {
	public void isBalancedString(String a)
	{
		    //does the string have balanced parenthesis?
		    
		    //go through the string (loop it) then whenever you encounter a {
		    //push it in a stack and whenever you encounter a } pop it 
		    //for the first, one I need to check if the stack is not empty () when I encounter a seocnd }, and if it is empty, stop the loop because the string is not balanced.  Also for the second case the stack would be empty but the stinrg will still be not balanced so I need a boolean var to prove that the if condition that prints whether the string is balanced is false, and the else exceuctes. if (isBalcned && stack is empty) 
		    
		    // In the second case I can reach the end of the string but the stack would not be empty, as it should for a string that has balanced parenthesis ,
		//Edge cases:
		/*
		 * {}}}}}}}}}}}}}} , 
		 * {{{{{{{{, 
		 * {}
		 */
		    boolean isBalanced = true;
		    Stack<Character> openParens = new Stack<Character>();
		    for(int i = 0; isBalanced && i < a.length(); i++)
		    {
		       if(a.charAt(i) == '{')
		       {
		       		openParens.push(a.charAt(i));
		       }
		       else if(a.charAt(i) == '}')
		       {
		       		if(!openParens.isEmpty())
		            {
		            	openParens.pop();
		            }
		            else
		            {
		            	isBalanced = false;
		            }
		       }
		    }
		    
		    if(isBalanced && openParens.isEmpty())
		    {
		    	System.out.println(a + " is balanced");
		    }
		    else
		    {
		    	System.out.println(a + " is not balanced");
		    }
	}
}
