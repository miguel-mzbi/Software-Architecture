package creational.builder;

public abstract class PizzaBuilder {
	public abstract void startPizza();
	public abstract void setName();
	public abstract void setMasa();
	public abstract void setSalsa();
	public abstract void setIngredientes();
	public abstract Pizza getPizza();
}
