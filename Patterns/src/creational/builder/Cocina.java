package creational.builder;

public class Cocina {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void buildPizza() {
		this.pizzaBuilder.startPizza();
		this.pizzaBuilder.setName();
		this.pizzaBuilder.setSalsa();
		this.pizzaBuilder.setMasa();
		this.pizzaBuilder.setIngredientes();
	}
	
	public Pizza getPizza() {
		return this.pizzaBuilder.getPizza();
	}
}
