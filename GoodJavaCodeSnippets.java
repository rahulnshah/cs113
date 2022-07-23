
import java.util.Scanner;
import java.util.Random;

public class GoodJavaCodeSnippets{
	public static void printAllCombs(int n)
	{
			/*
			 * common Brute-Force approach
			 * get all combinations of different indexes 
			 * notice i and j are never equal below
			 * less iterations with this method (exactly half of that of traditional nested loops), but still O(n^2) time complexity  
		    */
		    for(int i = 0; i < n; i++){
		    	for(int j = i + 1; j < n; j++){
		        	System.out.println("(" + i + ", " + j + ") ");
		        }
		    }
	}
   public static void moveAll(int [] arr)
   {  
      
      for(int i = 0; i < arr.length; i++)
      {
         int j = i;
         while(j > 0 && (arr[j-1] < 0 && arr[j] >= 0)) //key part 
         {
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
         }
      }
      
   }
   public static void printCounterTimes(int [] arr, int counter)
   {
      int c = 0;
      int i = 0;
      while (c < counter)
      {
         System.out.print(arr[i] + " ");
         if(i == arr.length - 1)          //increment c if this is true
         {
            c++;
         }
         i = (i + 1) % arr.length;
      }
      System.out.println("\ni: " + i);
   }
   public static boolean isPalindrome(String str)
   {
      /*checking a palindrome;  this algorithm works becase we don't need the middle letter; as soon 
      as the condition of the while loop becomes false (2 < 2) or (3 < 2), the loop stops*/
      
      int end, start;
      
      start = 0;
      end = str.length() - 1;
      
      while (start < end) {
         if (!( str.charAt(start) == str.charAt(end))) 
         {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }
   public static void compareStrings(String s1, String s2)
   {   
      if (s1.compareTo(s2) < 0){
         System.out.println(s1 + " comes before " + s2 + ": " + s1 + " " + s2);
      }
      else if (s1.compareTo(s2) > 0){
         System.out.println(s1 + " comes after " + s2 + ": " + s2 + " " + s1);
      }
      else{
         System.out.print(s1 + " and " + s2 + " are the same ");
      }
   }
   public static String switchAdjacentCharsOf(String str)
   {
      String str_temp  = "";
      boolean isOdd = str.length() % 2 == 1;
      for(int i = 1; i < str.length(); i+=2)
      {
         str_temp += str.charAt(i);
         str_temp += str.charAt(i - 1);
      }
      
      if (isOdd){
         str_temp += str.charAt(str.length() - 1);
      }
      return str_temp;
   }
   public static void printNums(int factor, int ... numList)
   {
      for(int i = 0; i < numList.length; i++)
      {
         System.out.println((factor*numList[i]) + " ");
      }
   }
   public static void addElementInArray(int i, int num, int [] arr)
   {
      
   // add an element into an array 
      int [] a = new int[arr.length + 1];
      
      //add all the original numbers in prev to array a and stop at index i 
      for(int j = 0;j < i; j++)
      {
         a[j] = arr[j];
      }
      
      //add the number to index i in array a
      a[i] = num;
      
      //add 1 to i
      i++;
      
      while(i < a.length)
      {
         a[i] = arr[i - 1];
         i++;
      }
      arr = a;
      System.out.println(java.util.Arrays.toString(arr));
      
   }
   public static int findSum(int [] a, int n, int m)
   {
      if(n > m) //false when n = m, so return a[n]
      {
         return a[n] + findSum(a, n - 1, m);
      }
      return a[n];
   }
   public static void diffBetween(double a, double b, double tolerance)
   {
      double diff = a - b;
      //System.out.println(diff);
      
      if(diff < 0)
      {
         System.out.println("smaller");
      }
      else if(diff >= 0 && diff < tolerance)
      {
         System.out.println("The same");
      }
      else
      {
         System.out.println("bigger");
      }
   }
   public static void printArray(char [] chars){
      for(char ch : chars)
      {
         System.out.print(ch + " ");
      }
      System.out.println("\n");
   }
   public static void givePermutationsOf(char [] ch)
   {
      char tempCh;
      
      //move the first char of ch to the end
      for(int j = 0; j < ch.length; j+=1)
      {
         for(int i = 0; i <= ch.length - 2; i+=1)
         {   
            tempCh = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = tempCh;
            printArray(ch);
         } 
      } 
   }
   public static int findNumOfOccurences(String str, String phrase)
   {
      if(str.indexOf(phrase) >= 0)
      {
         return 1 + findNumOfOccurences(str.substring(str.indexOf(phrase) + phrase.length()), phrase);//adding the indexOf(ph..) and ph...length() does not skip any leetrs
      }
      return 0; 
   }
   public static void main(String [] args){
      int [] arr = {1,2};
      char [] chars = {'a','b','c','d'};
      int counter = 3;
      String notAPalindrome = "car";
      String isAPalindrome = "radar";
      String oneLetter = "a";
      String twoLetter = "ab";
      //printCounterTimes(int [] arr, int counter)
      printCounterTimes(arr, counter);
      System.out.println();
      //isPalindrome(String str)
      System.out.println(isPalindrome(notAPalindrome));
      System.out.println(isPalindrome(isAPalindrome));
      System.out.println();
      //compareStrings(String s1, String s2)
      compareStrings(notAPalindrome, isAPalindrome);
      System.out.println();
      //switchAdjacentCharsOf(String str)
      System.out.println(switchAdjacentCharsOf(notAPalindrome));
      System.out.println(switchAdjacentCharsOf(isAPalindrome));
      System.out.println(switchAdjacentCharsOf(oneLetter));
      System.out.println(switchAdjacentCharsOf(twoLetter));
      System.out.println();
      //printNums(int factor, int ... numList)
      printNums(3, 4, 5, 6, 7);
      System.out.println();
      //addElementInArray(int i, int num, int [] arr)
      addElementInArray(0, counter, arr);
      System.out.println(java.util.Arrays.toString(arr)); //arr in main is unchanged
      System.out.println();
      //findSum(int [] a, int n, int m)
      System.out.println(findSum(arr, 0, 0));
      System.out.println(findSum(arr, 1, 0));
      System.out.println();
      //diffBetween(double a, double b, double tolerance)
      diffBetween(6.5, 6.5, 0.001);
      System.out.println();
      //givePermutationsOf(char [] ch)
      givePermutationsOf(chars);
      //findNumOfOccurences(String str, String phrase)
      System.out.println(findNumOfOccurences(isAPalindrome, "a"));
      System.out.println();
      //public static void printAllCombs(int n)
      printAllCombs(3);
   }

}