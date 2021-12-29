public class StackQueueEx{
   public static String reverseVowels(String s) {
        //char array
        char [] letters = new char[s.length()];
        
        for(int i = 0; i < letters.length; i++)
        {
           letters[i] = s.charAt(i); 
        }
        
        for(int i = 0; i < letters.length; i++)
        {
            System.out.println("i : " + i);
            if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u')
            {
                int current = i + 1;
                while(current < letters.length)
                {
                 if(letters[current] == 'a' || letters[current] == 'e' || letters[current] == 'i' || letters[current] == 'o' || letters[current] == 'u')
                 {
                     //switch
                     char temp = letters[i];
                     letters[i] = letters[current];
                     letters[current] = temp;
                     i = current - 1;
                     System.out.println("current : " + current + " i: " + i);
                     break;
                 }
                    current++;
                }
                
            }
        }
        
        String j = "";
        for(int i = 0; i < letters.length; i++)
        {
           j += letters[i]; 
        }
        
        return j;
        
    }
   public static void main(String[] args) {
      /* Stack stack = new Stack(5);
   
       stack.push(1);
       System.out.println(stack.top);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(10);
       stack.push(10); // hitting the line that says System.exit(1), so lines follwing this don't run 
       System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
      System.out.println(stack.top);
       System.out.println("\nAfter popping out");*/
       String s = null;
       String r = "adad";
       r = s;
       System.out.println(r);
       
       int [] arr = {1,2,3};
       for(int i = 0; i < arr.length - 1; i++)
       {
         System.out.println(arr[i] + " " + arr[i+1]);
       }
       
       // int i = 0;
//        int c = 0;
//        for(int j = i; j < 2; j++)
//        {
//          
//          if(j == 1)
//          {
//             break;
//          }
//          System.out.println(j);
//          c++;
//        }
//        
//        System.out.println(c);
//        
     
   
       //stack.printStack();
   
     }
}