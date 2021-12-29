import java.util.Scanner;
public class ParseInts
{
   public static void selectionSortIt(int ... numList)
   {
      //selection sort is find the element that is samller than the eleent at current index and swap, if you
      //don't find it swap the element at index i with itself 
      for(int i = 0; i < numList.length; i++)
      {
         int smallest = numList[i];
         int smallestIndex = i;
         for(int j = i + 1; j < numList.length; j++)
         {
            if(numList[j] < smallest)
            {
               smallest = numList[j];
               smallestIndex = j; //location 
            }
         }
         //swap here 
         int temp = numList[i];
         numList[i] = smallest;
         numList[smallestIndex] = temp;
      }
      System.out.println("smallest integer: " + numList[0]);
      if(numList.length > 1)
      {
         System.out.println("second smallest integer: " + numList[1]);
      }
   }
   
   public static void main(String [] args)
   {
      /*//wrte a && ... && statement using if else if else 
      String str = "o";
      
      //print false if str has length == 1, first letter of string is not an "h", or last letter of str is not "o"
      boolean result = true; 
      
      //if any of the above conditions are true, set result to false, print result and if none of them are true execute the 
      //else statement which prints reuslt as true 
      if(str.length() == 1)
      {
         result = false;
         System.out.println(result);
      }
      else if(str.charAt(0) != 'h')
      {
         result = false;
         System.out.println(result);
      }
      else if(str.charAt(str.length() - 1) != 'o')
      {
         result = false;
         System.out.println(result);
      }
      else
      {
         System.out.println(result);
      }*/
      
      // selectionSortIt(34,9);
      

      
      
      
   }
}   
   
