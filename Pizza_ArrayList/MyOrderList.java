import java.util.ArrayList;
import java.util.Date;
public class MyOrderList
{
   public ArrayList<String> orders; //keep a array list of all fast food orders with Date and time 
   
   public MyOrderList()
   {
      orders = new ArrayList<String>();
   }


   public void addOne(FastFood food)
   {
      Date now = new Date();
      orders.add(0,now + "-" + food.toString());
      
      if(orders.size() > 2) //maintain only a size of 2 orders in ArrayList 
      {
            orders.remove(2);
      }
   }
   
   public ArrayList<String> getOrderList()
   {
        return orders;
   }
   
   
}