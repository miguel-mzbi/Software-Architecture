package creational.builder;

public class Client {
	public static void main(String[] args) {
		Cocina cocina = new Cocina();
		PizzaBuilder hawaianPizzaBuilder = new HawaianPizzaBuilder();
		PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
				
		cocina.setPizzaBuilder(hawaianPizzaBuilder);
		cocina.buildPizza();
		Pizza hawaianPizza = cocina.getPizza();
		
		cocina.setPizzaBuilder(pepperoniPizzaBuilder);
		cocina.buildPizza();
		Pizza pepperoniPizza = cocina.getPizza();
		
		System.out.println(hawaianPizza.toString());
		System.out.println(pepperoniPizza.toString());

	}
}
