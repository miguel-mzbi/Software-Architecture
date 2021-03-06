package creational.builder;

public class Pizza {
	private String name;
	private String masa;
	private String salsa;
	private String ingredientes;
	
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	
	public String getMasa() {
		return masa;
	}
	public void setMasa(String masa) {
		this.masa = masa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name + ":\nMasa: " + this.masa + "\nSalsa: " + this.salsa + "\nIngredientes: " + this.ingredientes;
	}
	
}
