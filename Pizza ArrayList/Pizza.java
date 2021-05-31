public class Pizza extends FastFood{

   private int pizzaRadius;
   private String topping; 
 
   private static String specialIngredient = "Cheese";
  
   public Pizza(int pizzaRadius, String topping)
   {
      super("Pizza");
      this.pizzaRadius = pizzaRadius;
      this.topping = topping;
   }
   
   public String toString()
   {
      String result = super.toString() + ":" + "\nTopping: " + topping + "\nRadius: " + pizzaRadius;
      return result;
   }     
   
}

