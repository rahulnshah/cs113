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

		//valueOf() used with Integer and String 
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

	//Find all lonely numbers in the array 
		int [] nums = {1,2,3,1,2,3};
		
		//containsKey(), put(), and get() used with map 
		//(insertion order not retained in HashMap)
		Map<Integer, Integer> map = new HashMap<>();
		
		//How to fill up a map with frequencies of each num in nums - O(n) time 
		for(int num : nums)
		{
			//constainsKey() takes O(1) time 
			if(!map.containsKey(num)) 
			{
				map.put(num, 1);
			}
			else 
			{
				map.put(num, map.get(num) + 1);
			}
		}

		//traverse map using keySet()
		for (Integer key : map.keySet()) {
        		System.out.println(key + ":" + map.get(key) + "\n");
    		}
		
	//Infix to Postfix
		//isEmpty(), peek() used with Stack
	 	Stack<Integer> numeros = new Stack<Integer>();
		for(int i = 0; i < 9; i++)
		{
			numeros.push(i);
		}
		
		while(!numeros.isEmpty())
		{
			System.out.print(numeros.peek() + " ");
			numeros.pop();
		}

		//statement below prints a space
		System.out.println();
		
		//toCharArray() used with strings
		char [] str = "hello world".toCharArray();
		//[H, e, l, l, o,  , w, o, r, l, d] -> an array of chars 
    	System.out.println(Arrays.toString(str));
    	
    	System.out.println();
    	//Valid Anagram: integer operations with chars 
    	int index = str[0] - 'a';
    	System.out.println(index);
    	
    	// initializing different data structures in Java
    	ArrayList<Integer> aList = new ArrayList<>();
    	
    	Stack<Integer> aStack = new Stack<>();
    	
    	List<Integer> anotherList = new ArrayList<>();
    	
    	Map<String, Integer> anotherMap = new HashMap<>();
    	
    	HashMap<String, Integer> aMap = new HashMap<>();
    	
    	Map<Integer, String> anotherTreeMap = new TreeMap<>();
    	
    	TreeMap<Integer, String> aTreeMap = new TreeMap<>();
    	
    	PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    	
	}


}
