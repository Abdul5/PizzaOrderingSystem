
public class Bill {
	public static void main(String[] args){

	       Pizza order1 = new Pizza(true);
	       order1.extraToppings1();
	       order1.vegTakeAway();
	       System.out.println(order1.generateBill1());

	       System.out.println();
	       DeluxPizza order2 = new DeluxPizza(false);
	       order2.takeAway();
	       System.out.println(order2.generateBill());

	   }

}
