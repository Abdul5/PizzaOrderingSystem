import java.util.*;
public class Pizza {
	Scanner sc = new Scanner(System.in);
	private final int basePrice; // different for veg and non veg

	   private final int toppingPrice; // different for veg and non veg, added on extra topping

	   private final int cheesePrice = 80; // same for both, added if customer wants extra cheese

	   private final int bagPrice = 20; // added if

	   private final boolean isVeg;

	   private int total;
       
	   private boolean isCheeseAdded = false;
	   private boolean isToppingsAdded = false;
	   private boolean isToppingsAdded1 = false;
	   private boolean isTakeAwayAdded1 = false;
	   private boolean isTakeAwayAdded = false;

	   Pizza(boolean isVeg){
		   this.isVeg = isVeg;

	       if(isVeg){ // prices are different for veg and non veg
	           //basePrice = 300;
	    	   System.out.println("Price Of Veg-Pizza :");
	           basePrice = sc.nextInt();
	    	   System.out.println("Veg-toppingPrice :");
	           toppingPrice = sc.nextInt();
	           System.out.println("This is Veg-Pizza :-----");
	           total = 0;
	       }
	       else {
	    	   System.out.println("Price Of Non-Veg-Pizza :");
	           basePrice = sc.nextInt();
	           System.out.println("Non-Veg-toppingPrice :");
	           toppingPrice = sc.nextInt();
	           System.out.println("This is Non-Veg-Pizza :-----");
	           total = 0;
	       }
	   }

	   public void extraCheese(){
	       if(isCheeseAdded == false) {
	           total = basePrice + cheesePrice;
	           isCheeseAdded = true;
	       }
	   }

	   public void extraToppings(){
	       if(!isToppingsAdded){
	           total = basePrice + toppingPrice;
	           isToppingsAdded = true;
	       }

	   }
	   
	   public void extraToppings1(){
	       if(!isToppingsAdded1){
	           total = basePrice + toppingPrice;
	           isToppingsAdded1 = true;
	       }

	   }
	   
	   public void vegTakeAway(){
	       if(!isTakeAwayAdded1){
	           total = basePrice + bagPrice + toppingPrice;
	           isTakeAwayAdded1 = true;
	       }
	   }

	   public void takeAway(){
	       if(!isTakeAwayAdded){
	           total = basePrice + bagPrice + toppingPrice + cheesePrice;
	           isTakeAwayAdded = true;
	       }
	   }
	   
	   public String generateBill1(){
	       String bill = "Base Price Of The Pizza: " + basePrice + "\n";

	       if(isToppingsAdded1) // add if he opted for extra toppings
	           bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";

	       if(isTakeAwayAdded1) // if he is opted for takeaway
	           bill = bill + "Paperbag Added: " + bagPrice + "\n";

	       bill = bill + "Total Price: " + total;

	       return bill;
	   }

	   public String generateBill(){
	       String bill = "Base Price Of The Pizza: " + basePrice + "\n";

	       if(isCheeseAdded) // add in bill if he opted for extra cheese,
	           bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";

	       if(isToppingsAdded) // add if he opted for extra toppings
	           bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";

	       if(isTakeAwayAdded) // if he is opted for takeaway
	           bill = bill + "Paperbag Added: " + bagPrice + "\n";

	       bill = bill + "Total Price: " + total;

	       return bill;
	   }

}
