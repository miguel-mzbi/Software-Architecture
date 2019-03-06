package creational.builder;

public class PepperoniPizzaBuilder extends PizzaBuilder {
	private Pizza pizza;
	
	@Override
	public void setName() {
		this.pizza.setName("Pepperoni Pizza");
	}

	@Override
	public void setMasa() {
		this.pizza.setMasa("Light");
		
	}

	@Override
	public void setSalsa() {
		this.pizza.setSalsa("Tomato");		
	}

	@Override
	public void setIngredientes() {
		this.pizza.setIngredientes("Pepperoni");
		
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

	@Override
	public void startPizza() {
		this.pizza = new Pizza();	
	}

}
