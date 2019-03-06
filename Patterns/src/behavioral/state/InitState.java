package behavioral.state;

public class InitState implements State{

	public InitState(VendingMachineUI vendingMachineUI) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eject(VendingMachineUI app) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(VendingMachineUI app) {
		app.qtyMoney++;
		app.display(Integer.toString(app.qtyMoney));
		app.currentState = app.readyState;		
	}

	@Override
	public void dispense(VendingMachineUI app) {
		// TODO Auto-generated method stub
		
	}

}
