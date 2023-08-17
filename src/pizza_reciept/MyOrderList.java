package pizza_reciept;

import java.util.TreeMap;
import java.util.Calendar;
import java.util.Date;
public class MyOrderList
{
   private TreeMap<Date, FastFood> orders; //keep a TreeMap of all fast food orders with Date 
   private static Calendar cal;
   private static Date nowTime;
   
   public MyOrderList()
   {
      orders = new TreeMap<>();
      cal = Calendar.getInstance();
      nowTime = new Date();
      cal.setTime(nowTime);
   }

   public void addOne(FastFood food)
   {
      cal.add(Calendar.SECOND, 1); //add one second to whatever nowTime is at a given moment 
      nowTime = cal.getTime();
      cal.setTime(nowTime);
      orders.put(nowTime,food);
      
      if(orders.size() > 3) //maintain only a size of 2 orders in TreeMap 
      {
            orders.pollFirstEntry();
      }
   }
   
   public TreeMap<Date, FastFood> getOrderList()
   {
        return orders;
   }
   
   
}