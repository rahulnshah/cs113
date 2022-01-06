
public class ArrayListInAction{
    public static void main(String[] args) {
     
     MyOrderList myorders = new MyOrderList();
     Pizza p1 = new Pizza(5,"pineapple"); 
     Pizza p2 = new Pizza(5,"green peppers");
     Pizza p3 = new Pizza(5, "tomatoes");
     Pizza p4 = new Pizza(5, "Broccoli");
     myorders.addOne(p1);
     myorders.addOne(p2);
     myorders.addOne(p3);
     myorders.addOne(p4);
     
     System.out.println(myorders.getOrderList() + " ");
                

    }
}