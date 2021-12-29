/*
Rahul N Shah
CS113-026 HW7 Problems 1-4
4/7/2021
*/
import java.util.Random;
public class TestRecursion
{
   
   public static int [] firstFewOdds(int [] numArray, int target)
   {
   
   //return an array of length target, filled with only odd numbers found in numArray
      int [] onlyOdds = new int[target];
      int temp = 0;
   
   //loop through numArray find the odds 
      for(int i = 0; i < numArray.length && temp < onlyOdds.length; i++)
      {
      //but i need a second condition in the loop to stop looping 
      // so that I do not get an index out of bounds error from onlyOdds array
         if(numArray[i]%2 == 1)
         {
            onlyOdds[temp] = numArray[i];
            temp++;
         }
      }
   
   //let’s say that  i < numArray.length becomes false so the loop above stops
   // what if there are still empty spaces in onlyOdds?
   //start looping at the last index of onlyOdds, break out of loop when 
   // onlyOdds[i] != 0
      for(int i = onlyOdds.length - 1; i >= 0 && onlyOdds[i] == 0; i--)
      {
         onlyOdds[i] = -1;
      }
   
      return onlyOdds;
   
   }

   public static void main(String [] args)
   { //
   
      System.out.println(args[0].substring(0,3) + args[1]);
   //       printDigits(23145);
   //       System.out.println();
   // 
   //       int [] array = {1,3,2};
   //       System.out.println(sumArray(array) + "\n");
   //       
   //       pascalTriangle(9);    
      // int [][] arr = new int[3][5];
   //       
   //       for(int row = 0; row < arr.length; row++)
   //       {
   //          for(int col = 0; col < arr[row].length; col++)
   //          {  
   //             arr[row][col] = col+1;
   //             System.out.print(arr[row][col] + " ");
   //          }
   //          System.out.println();
   //       } 
   //        
   //    int numTimes = 1;
//    
//       int [][] arr_1 = new int[3][5];
//                               
//       for(int row = 0; row < arr_1.length; row++)
//       {
//          int num0s = 0;
//          for(int col = 4; num0s < numTimes && col < arr_1[row].length; col++)
//          {
//             arr_1[row][col] = 1;
//             num0s++;
//          }
//          numTimes++;
//       } 
//       for(int row = 0; row < arr_1.length; row++)
//       {
//          for(int col = 0; col < arr_1[row].length; col++)
//          {  
//                  
//             System.out.print(arr_1[row][col] + " ");
//          }
//          System.out.println();
    } 

}