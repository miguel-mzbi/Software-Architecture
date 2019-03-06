package behavioral.iterator;

import java.util.Iterator;

public class Client {
	public static void main(String [] args) {
		Account account = new Account();
		account.addDeposit(100);
		account.addDeposit(200);
		account.addDeposit(50);
		
		// Hacker
//		ArrayList<Money> deposits = account.getDesposits();	// mutable object! returned by reference
//		deposits.add(new Money(1000000));
//		
//		for(int i = 0; i < deposits.size(); i++)
//		{
//			deposits.get(i).print();
//		}
		
		Iterator<Money> it = account.getIterator();
		while(it.hasNext()) {
			it.next().print();
		}
	}
}
