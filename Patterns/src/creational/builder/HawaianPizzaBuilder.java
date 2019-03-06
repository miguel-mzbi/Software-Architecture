package creational.builder;

public class HawaianPizzaBuilder extends PizzaBuilder {
	private Pizza pizza;
	
	@Override
	public void setName() {
		this.pizza.setName("Hawaian Pizza");
	}

	@Override
	public void setMasa() {
		this.pizza.setMasa("Thick");
		
	}

	@Override
	public void setSalsa() {
		this.pizza.setSalsa("Tomato");		
	}

	@Override
	public void setIngredientes() {
		this.pizza.setIngredientes("Pineapple & Ham");
		
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
