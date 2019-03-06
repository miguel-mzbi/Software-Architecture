package behavioral.state;

public interface State {
	public void eject(VendingMachineUI app);
	public void insert(VendingMachineUI app);
	public void dispense(VendingMachineUI app);

}
