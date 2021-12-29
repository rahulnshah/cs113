import java.util.Arrays;
public class Example1{
   
   public static String reverse(String s, int counter) 
   {
      if (s.length() > 1) // "LE"
      {  
         return reverse(s.substring(1),counter + 1) + s.charAt(0);
      }
      System.out.println("counter: " + counter);
      return s;
   }
   public static void main(String [] args)
   {
      //String a = "A";
      String str = "fsadfasdfasfasf";
      int si = 0;
      int ei  = str.length() - 1;
      int counter = 0;
   // a
   // a a
   // b c
   // a c c -> cc | c = 1
   
   // a e b e b a | c: 1
   
   //e b b e | c: 0
      /*while(si < ei) // 0 < 2
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
   
      System.out.println(counter);*/
   
   
            //System.out.println(a.substring(1).length());
   //       String a = new String("a");
   //       a = a.replace("a", "b");
   //       // return new String("b");
   //       System.out.println(a);
   //       String a = "";
         //System.out.println(a.substring(6,7));
         
      // for(int i = 0; i < a.length(); i++)
   //       {
   //          System.out.println(a.substring(i,i + 1)); 
   //       }
   // 
   //          System.out.println(reverse(a, 11));
   //          
   //          int [] n = new int[5];
   //          n[0] = 1;
   //          n[1] = 45;
   //          int [] j = n;
   //          j[4] = 459;
   //          j[3] = 455;
   //          
   //          System.out.println(Arrays.toString(n) + "\n" + Arrays.toString(j));
            
      /*int [] list = {7,5,4,2}; 
      int coun = 0;
      int min;
      for (int index = 0; index < list.length - 1; index++){   
         int temp;
         min = index;     
         for (int scan = index + 1; scan < list.length; scan++)
         {
            if (list[scan] < list[min]) 
            {
               min = scan;
            }
                
         } 
             //swap
         coun++;
         temp = list[min];         
         list[min] = list[index];         
         list[index] = temp; 
            
         System.out.println(Arrays.toString(list)); 
                         
                        // Swap the values
      
         
      }
      System.out.println(coun);*/
            
      int [] arr = {1,2};
   
      int cou = 1;
   
      for(int i = 0; i < arr.length && cou <= 20; i++)
      {
         System.out.print(arr[i] + " ");
         if(i == arr.length - 1)
         {
         //reset i to 0
            i = -1;
            //System.out.print("i: " + i +" ");
            cou++;
         }
      }
   }
}
