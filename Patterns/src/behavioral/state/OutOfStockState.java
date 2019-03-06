package behavioral.state;

public class OutOfStockState implements State{

	public OutOfStockState(VendingMachineUI vendingMachineUI) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eject(VendingMachineUI app) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(VendingMachineUI app) {
		System.out.println("Returning Money");
		app.display("Out of Stock");		
	}

	@Override
	public void dispense(VendingMachineUI app) {
		// TODO Auto-generated method stub
		
	}

}
