import pizza_reciept.FastFood;
import pizza_reciept.MyOrderList;
import pizza_reciept.Pizza;

import java.util.Random;
public class TreeMapInAction{
    public static void main(String[] args) 
    {
     
	     MyOrderList myorders = new MyOrderList();
	     String [] toppingsToPut = {"pineapple", "green peppers", "tomatoes", "broccoli"};
	     Random randNumGen = new Random();
	     
	     for(String topping : toppingsToPut)
	     {
	    	double pizzaRadius = randNumGen.nextInt(9) + 8; // 8-in to 16-in pie
	        FastFood pizza = new Pizza(pizzaRadius,topping);
	        myorders.addOne(pizza);
	     }
	     
	     System.out.println(myorders.getOrderList()); 
    }
}