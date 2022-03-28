package DSA.problems.HashMaps;
import java.util.*;
public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>(2); 
        answer.add(new ArrayList<Integer>());
        answer.add(new ArrayList<Integer>());
        //create maps for nums1 and nums2 to remove duplicates 
        Map<Integer, Integer> mp1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mp2 = new HashMap<Integer, Integer>();
        //loop nums1
        for(Integer num1 : nums1)
        {
            if(!mp1.containsKey(num1))
            {
               mp1.put(num1,1); 
            }
        }
        //loop nums2
        for(Integer num2 : nums2)
        {
            if(!mp2.containsKey(num2))
            {
                mp2.put(num2,1); 
            }
        }
        //loop mp1 and if () add it to arraylist at index 0
        for(Integer key : mp1.keySet())
        {
            if(!mp2.containsKey(key))
            {
                answer.get(0).add(key); 
            }
        }
        //loop mp1 and if () add it to arraylist at index 1
        for(Integer key : mp2.keySet())
        {
            if(!mp1.containsKey(key))
            {
                answer.get(1).add(key);
            }
        }
        //mem: o(n)
        //time comp: o(n)
        return answer;
    }
    
    public static void main(String [] args)
    {
    	int [] nums1 = {1,2,3,3};
    	int [] nums2 = {1,2,2};
    	System.out.println(findDifference(nums1, nums2));
    }

}