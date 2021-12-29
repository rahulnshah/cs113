// Stack implementation in Java

public class Stack {
  private int arr[];
  public int top;
  //private int capacity;

  // Creating a stack
     public Stack(int size) {
       arr = new int[size];
       // capacity = size;
       top = -1;
     }
   
     // Add elements into stack
     public void push(int x) {
       if (isFull()) {
         System.out.println("OverFlow\nProgram Terminated\n");
         System.exit(1);
       }
   
       System.out.println("Inserting " + x);
       top++;
       arr[top] = x;
     }
   
     // Remove element from stack
     public int pop() {
       if (isEmpty()) {
         System.out.println("STACK EMPTY");
         System.exit(1);
       }
       int a = arr[top]; //capture last val pointed by top 
       arr[top] = 0; 
       top--;
       return a; // not necessary to store last top value in a, can also do return arr[top--], which just decrements top by 1
     }
   
     // Utility function to return the size of the stack
     public int size() {
       return top + 1;
     }
   
     // Check if the stack is empty
     public Boolean isEmpty() {
       return top == -1;
     }
   
     // Check if the stack is full
     public Boolean isFull() {
       return top == arr.length - 1;
     }
   
     public void printStack() {
       for (int i = 0; i <= top; i++) {
         System.out.println(arr[i]);
       }
     }
}