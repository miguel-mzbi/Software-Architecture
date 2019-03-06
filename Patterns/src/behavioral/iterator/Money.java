package behavioral.iterator;

public class Money {
	private double qty;
	
	public Money()
	{
		this.qty = 0.;
	}
	
	public Money(double qty)
	{
		this.qty = qty;
	}
	public void print()
	{
		System.out.println(this.qty);
	}
}
