public class ExampleRecursion {

   public static void main(String[] args) {
   
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(45);
        Node d = new Node(34);
        Node head; //null 

        
        //create linked list head = b -> null
        head = b;
        a.next = b;
        c.next = d;
        
        int [] x = [9,18];
        
        
        // count number of nodes 
        int counter = 0;
        while(head != null)
        {
          counter++;
          System.out.println("iteration : " + counter);
          head = head.next;
        }
        System.out.println("c : " + counter);
   
   }
   
 }
