import java.util.*;
public class SequentialLetters
{
	public static String [] compressString(String [] strs)
	{
		//loop strs, str the freq in a hashmap 
		Map<String, Integer> mp = new HashMap<>();
		String emptyStr = "";
		String validLetters = "abcdefghijklmnopqurstuvwxyz";
		for(String str : strs)
		{
		    if(validLetters.contains(str.toLowerCase()))
	            {
			if(!mp.containsKey(str))
			{
				mp.put(str, 1);
			}
			else
			{
				mp.put(str, mp.get(str) + 1);
			}
		   }
			
		}

		//loop the hashmap, attach key value to aen ampty string 
		for(String str : mp.keySet())
		{
			emptyStr += str + mp.get(str);
		}
		return emptyStr.split("");
	}
	public static void main(String [] args)
	{	
		String name = "ab     \n\n\nacd"; 

		//when name is "", compressString still outputs 1 even though name.length() = 0, because inpt.length is 1 - to fix this only call compressString 
		if(name.length() > 0)
		{
			String [] inpt = name.split("");
			String [] outpt = compressString(inpt);
			for(String str : outpt)
			{
				System.out.print(str);
			}
		}
		//a2b1c1d1
	}

}