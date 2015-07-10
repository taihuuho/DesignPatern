package observer;

public class Observer1 implements Observer {

	public Observer1(Stack stack) {
		stack.attach(this);
	}
	
	@Override
	public void update(String action, String item) {
		System.out.println("Observer 1 : " + action + " " + item);
	}

}
