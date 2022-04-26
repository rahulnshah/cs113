
package DSA.problems.Stack;
import java.util.Stack;
public class ValidParentheses {
	public boolean isValid(String a) {
        
	    //does the string have balanced parenthesis?
	    
	    //go through the string (loop it) then whenever you encounter a {, [, or (
	    //push it in a stack and whenever you encounter a }, ], or ) pop from the stack. 
	    //when will isBalanced be false? whencer I encounter a closing parenthesis and the stack is empty or when you call the peek method and the char on top isn't the correpsonding openin parnethesis
	    //if 
	    boolean isBalanced = true;
	    Stack<Character> openParens = new Stack<Character>();
	    for(int i = 0; isBalanced && i < a.length(); i++)
	    {
	    
	    	if(a.charAt(i) == '{' || a.charAt(i) == '(' || a.charAt(i) == '[')
	       	{
	       		openParens.push(a.charAt(i));
	       	}
	        else if(a.charAt(i) == ']')
	        {
	        	if(openParens.isEmpty())
	            {
	            	isBalanced = false;
	            }
	            else // stack is NOT empty 
	            {
	            	if(openParens.peek() == '[')
	                {
	                	openParens.pop();
	                }
	                else 
	                {
	                	isBalanced = false;
	                }
	            }
	        }
	        else if(a.charAt(i) == ')')
	        {
	        	if(openParens.isEmpty())
	            {
	            	isBalanced = false;
	            }
	            else
	            {
	            	if(openParens.peek() == '(')
	                {
	                	openParens.pop();
	                }
	                else 
	                {
	                	isBalanced = false;
	                }

	            }
	        }
	        else if(a.charAt(i) == '}')
	        {
	        	if(openParens.isEmpty())
	            {
	            	isBalanced = false;
	            }
	            else
	            {
	            	if(openParens.peek() == '{')
	                {
	                	openParens.pop();
	                }
	                else 
	                {
	                	isBalanced = false;
	                }

	            }
	        }
	    }
	   	if(isBalanced && openParens.isEmpty())
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	    
	    
	    }
}
