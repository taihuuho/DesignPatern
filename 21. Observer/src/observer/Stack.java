package observer;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Subject {
	private List<Observer> observers;
	private String action;
	private String item;

	public Stack() {
		observers = new ArrayList<Observer>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0)
			observers.remove(i);
	}

	public void notifyObservers() {
		int n = observers.size();
		for (int i = 0; i < n; ++i) {
			Observer observer = (Observer) observers.get(i);
			observer.update(this.action, this.item);
		}
	}

	public void updateData() {
		notifyObservers();
	}

	public void push(String item) {
		this.action = "PUSH";
		this.item = item;
		updateData();
	}

	public void pop() {
		this.action = "POP";
		this.item = "";
		updateData();
	}

}