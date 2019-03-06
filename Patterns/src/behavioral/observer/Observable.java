package behavioral.observer;

import java.util.ArrayList;

public class Observable {
	ArrayList<Observer> observers;
	
	public Observable()
	{
		this.observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer observer)
	{
		this.observers.add(observer);
	}
	
	public void notifyObserevers()
	{
		for (int i = 0; i < this.observers.size(); i++) {
			this.observers.get(i).update();
		}
	}
}
