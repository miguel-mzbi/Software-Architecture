package behavioral.observer;

public class DecimalNumber extends Observable{
	int value;
	
	public DecimalNumber()
	{
		this.value = 0;
	}
	
	public DecimalNumber(int value)
	{
		this.value = value;
	}
	
	public void set(int value)
	{
		this.value = value;
		this.notifyObserevers();
	}
	
	public int get()
	{
		return this.value;
	}
	
	public String getBinary()
	{
		return Integer.toBinaryString(this.value);
	}
	
	public String getHex()
	{
		return Integer.toHexString(this.value);
	}
	
	public String getOctal()
	{
		return Integer.toOctalString(this.value);
	}
}
