package pizza_reciept;

public class Pizza extends FastFood{

   private double pizzaRadius;
   private String topping; 
   private static String specialIngredient = "Cheese";
  
   public Pizza(double pizzaRadius, String topping)
   {
      super("pizza_reciept.Pizza");
      this.pizzaRadius = pizzaRadius;
      this.topping = topping;
   }
   
   public String toString()
   {
      String result = super.toString() + ":" + "\nTopping: " + topping + "\nRadius: " + pizzaRadius;
      return result;
   }     
   
}

