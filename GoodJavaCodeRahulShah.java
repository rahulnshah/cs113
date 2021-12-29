
import java.util.Scanner;
import java.util.Random;

public class GoodJavaCodeRahulShah{
   public static void moveAll(int [] arr)
   {
      
      for (int i = 0; i < arr.length; i++)
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
   public static void main(String [] args){
   
   
   int [] arr = {1,2};
   
   int counter = 1;
   
   for(int i = 0; i < arr.length && counter <= 2; i++)
   {
      System.out.println(arr[i]);
      if(i == arr.length - 1)
      {
         //reset i to 0
         i = (i + 1)%arr.length;
         counter++;
      }
   
   }
//     String str = "raddak";
//     String str_2 = "baab";
//     int startI = 0;
//     // test str for simplicity 
//     int endI = str.length() - 1;
//     
//     // checking a palindrome;  this algorithm works becase we don;t need the middle letter
//     // as soon as the condition of the while loop becomes false (2 < 2) or (3 < 2), the loop stops  
//     while (startI < endI) {
//       if (!( str.charAt(startI) == str.charAt(endI) )){
//          System.out.println("Not a palindrome");
//          break;
//          }
//       startI++;
//       endI--;
//       
//       }
//       
//       int num = 56;
//       
//             
//       int startNum = 56;
//       // prints the divisors of an int from startNum up to and including num
//       
//       while (startNum <= num){  
//          int divisor = 1;
//          System.out.print("divisors of " + startNum + ": ");
//          while (divisor <= 10){
//          
//             if(startNum%divisor == 0){
//                System.out.print(divisor + " ");
//                if (startNum / divisor > 10){
//                   System.out.print(startNum / divisor + " ");
//                   }
//                }
//                divisor++;
//          }
//          
//          // increment somethiung here 
//          startNum++;
//          System.out.println();  
//       }
      
//       comparing to strings 

//          String s1,s2;
//          s1 = "a";
//          s2 = "b";
//          
//          if (s1.compareTo(s2) < 0){
//             System.out.println(s1 + " comes before " + s2 + ": " + s1 + " " + s2);
//          }
//          else if (s1.compareTo(s2) > 0){
//             System.out.println(s1 + " comes after " + s2 + ": " + s2 + " " + s1);
//          }
//          else{
//             System.out.print(s1 + " and " + s2 + " are the same ");
//          }  


// //   Plaindrom modified (works with or without case and with or without ',' )
//          String str = "r,AD,d,ar";
//          int startI = 0;
//          int endI = str.length() - 1;
//          
//          str = str.toLowerCase();
//          
//          while (startI < endI) {
//             if (str.charAt(startI) == ','){
//                startI++;
//             }
//             if (str.charAt(endI) == ','){
//                endI--;
//             }
//             if (!( str.charAt(startI) == str.charAt(endI) )){
//                System.out.println("Not a palindrome");
//                break;
//                }
//             startI++;
//             endI--;
//             
//       } 


// String str = "helloooooooolloooolloool";
//       String phrase = "oo";
//       String temp;
//       int count = 0;
//       String firstLetter = phrase.substring(0,1);
//       int index = str.indexOf(firstLetter);
//       
//       //finds all occurences of a phrase in str
//       while( index >= 0 && index <= (str.length() - phrase.length())){
//          temp = str.substring(index);
//          if(temp.substring(0,phrase.length()).equals(phrase)){
//             //temp = str.substring(index + phrase.length());
//             index+=(phrase.length()-1);
//             count++;
//          }
//          //index = str.substring(index + 1).indexOf(firstLetter);
//          index++;
//       }
//       
//       System.out.println(count);
//    

//    Premutations 

   
      // char [] ch = {'o','t','w', 'e'};
//       char tempCh;
//       
//       //move the first char of ch to the end
//       for(int j = 0; j < ch.length; j+=1){
//          for(int i = 0; i <= ch.length - 2; i+=1)
//          {   
//             tempCh = ch[i];
//             ch[i] = ch[i+1];
//             ch[i+1] = tempCh;
//             printArray(ch);
//          } 
//       }      
  
  
   // public static void printArray(char [] chars){
//       for(char ch : chars)
//       {
//          System.out.print(ch + " ");
//       }
//       System.out.println("\n");
//    }
//  Printing the number of times a letter ouccrs consecutively in a string
// String str = "ab#";
//       char currLetter; // first letter - 'a'
//       int numTimes = 1;
//       String temp = "";
//       int i = 0;
//       
//       
//       while (i < str.length() - 1){
//          
//          currLetter = str.charAt(i);
//          // we have not consisdered the last letter 
//          if (str.charAt(i+1) == currLetter)
//          {
//             numTimes++;
//          }
//          else
//          {
//             temp = temp + numTimes + currLetter;
//             numTimes = 1;
//          }
//          i++;
//       
//       }

//    input: hello output: ehllo
// 
//    String str = "hello";
//    String str_temp  = "";
//    boolean isOdd = str.length() % 2 == 1;
//    
//    
//    for(int i = 1; i < str.length(); i+=2){
//       
//       str_temp += str.charAt(i);
//       str_temp += str.charAt(i - 1);
//    
//    }
//    
//    if (isOdd){
//       str_temp += str.charAt(str.length() - 1);
//    }
// 
//    System.out.println(str_temp);    

// add an element into an array 

		// // add a number to an array at index i; assume i < prev.length, and
//       // you can only add one number at a time to the array
//       
//       //2      3
//       
//       //2      26     3
//       
//       int i = 1, num = 56;
//       int [] prev = {1,2};
//       int [] a = new int[prev.length + 1];
//       
//       //add all the original numbers in prev to array a and stop before the index i 
//       for(int j = 0;j < i; j++)
//       {
//          a[j] = prev[j];
//       }
//       
//       //add the number to index i in array a
//       a[i] = num;
//       
//       //add 1 to i
//       i++;
//       
//       while(i < a.length)
//       {
//       a[i] = prev[i - 1];
//       i++;
//       }
//       
         // int [] b = {1,2,3,4};
//          addAnElement(4, 56, b);
         
         //histogram
         
        /* int [] a = new int[11];
//       System.out.print(a[0]);
         int randNum;
         
         Random gen = new Random();
         
         for(int i = 0; i < 10; i++)
         {
            randNum = gen.nextInt(100) + 1;
            a[randNum/10] =  a[randNum/10] + 1;
            System.out.println(randNum + " " + a[randNum/10]);
         }
         
         for(int i = 0; i < a.length; i++)
         {
            System.out.print(i + " ");
            for(int j = 0; j < a[i]; j++)
            {
               System.out.print("*" + " ");
            }
            System.out.println("");
         }*/
//          playijg nwith 2d arrays:
//// 0 0 0 0 0 0 0 0 0 0 
// 0 0 0 1 0 0 0 0 0 0 
// 0 0 0 1 1 0 0 0 0 0 
// 0 0 0 1 1 1 0 0 0 0 
// 0 0 0 1 1 1 1 0 0 0    
// int numTimes = 1;
//             
//  int [][] arr_1 = new int[5][10];
//                               
//             for(int row = 1; row < arr_1.length; row++)
//             {
//                int num0s = 0;
//                for(int col = 3; num0s < numTimes && col < arr_1[row].length; col++)
//                {
//                   arr_1[row][col] = 1;
//                   num0s++;
//                }
//                numTimes++;
//             }

// public static int findSum(int [] a, int n)
//    {
//       if(n > 1)
//       {
//          return a[n - 1] + findSum(a, n - 1);
//       }
//       return a[n - 1];
//    }

//    var list param. 
// public static void printNums(int factor, int ... numList)
//    {
//       for(int i = 0; i < numList.length; i++)
//       {
//          System.out.println((factor*numList[i]) + " ");
//       }
//    }
//    public static void main(String[] args)
//    {
//       printNums(5,1,2,3,4,5,6,4,5,6); 
//    }

     //  double diff = 3.155556 - 3.155555;
//       System.out.println(diff);
//       
//       if(diff < 0)
//       {
//          System.out.println("smaller");
//       }
//       else if(diff >= 0 && diff < 0.001)
//       {
//          System.out.println("The same");
//       }
//       else
//       {
//          System.out.println("bigger");
//       }

      // int [] arr = {5, 8, 7, 12, 14, 3, 9};
//       
//       int k, x;
//       
//       k = 2;
//       x = 8;
//       
//       for (int i = 0; i < arr.length; i += k)
//       {
//          boolean foundIt = false;
//          for (int j = i; j <= i + (k - 1) && j < arr.length; j += 1)
//          {
//             if(arr[j] == x)
//             {
//                foundIt = true;
//                break;
//             }
//          }
//          if(!foundIt)
//          {
//             System.out.println("No");
//             break;
//          }
//       }
//       
//       System.out.println("Done");
//       int [] y = {-5, 7, -3, -4, 9, 10, -1, 11};
//       moveAll(y);

         // the hourglass problem

           //  int [][] A = {
//                            {1, 1, 1, 0, 0, 0},
//                            {0, 1, 0, 0, 0, 0},
//                            {1, 1, 1, 0, 0, 0},
//                            {0, 0, 2, 4, 4, 0},
//                            {0, 0, 0, 2, 0, 0},
//                            {0, 0, 1, 2, 4, 0} };
//             
//             int max= 0;
//             for(int i = 0; i <= A.length - 3; i++)
//             {
//          	   for(int j = 0; j <= A[i].length - 3; j++)
//          	   {
//             		int sum = 0;
//             		int h = A[i][j] + A[i][j + 1] + A[i][j + 2] ;
//             		int m = A[i + 1][j + 1];
//             		int e = A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2];
//             		sum  = h + m + e;
//             		if(sum > max)
//             		{
//             			max = sum;
//             		}
//                }
//             }
//             
//             System.out.println(max);
String str = "geeksforgeeks";
      int si = 0;
      int ei  = str.length() - 1;
      int counter = 0;
   // a
   // a a
   // b c
   // a c c -> cc | c = 1
   
   // a e b e b a | c: 1
   
   //e b b e | c: 0
      while(si < ei) // 0 < 2
      {
         if(str.charAt(si) != str.charAt(ei))
         {
            if(str.charAt(si) == str.charAt(ei - 1))
            {
               counter++;
               si+=1; // 1
               ei-=2; // -1
            }
            else if(str.charAt(si + 1) == str.charAt(ei))
            {
               counter++; // c: 1
               si+=2; // 2
               ei-=1; // 1
            }
            else
            {
               counter += 2;
               si++;
               ei--;
            }
         
         }
         else
         {
            si++; // 1
            ei--; // 0
         }
      
      }
   
      System.out.println(counter);
   
   }
   
   
               int [] b = {6, 10, 5, 4, 9, 120, 4, 6, 10};
               
               
               for (int i = 0; i < b.length; i++)
               {
                  
                  for (int j = i + 1; j < b.length; j++)
                  {
                     if(b[j] == b[i])
                     {
                        System.out.println(b[i]);
                        break;
                     }
                  }
               }

   }
   
}