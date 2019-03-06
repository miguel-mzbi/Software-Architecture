package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {
	private ArrayList<Money> deposits = new ArrayList<Money>();
	
//	public ArrayList<Money> getDesposits()
//	{
//		return this.deposits;
//	}
	
	public Iterator<Money> getIterator() {
		return this.deposits.iterator();
	}
	
	public void addDeposit(double qty)
	{
		this.deposits.add(new Money(qty));
	}
}
