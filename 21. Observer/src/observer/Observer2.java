package observer;

public class Observer2 implements Observer {

	public Observer2(Stack stack) {
		stack.attach(this);
	}
	
	@Override
	public void update(String action, String item) {
		System.out.println("Observer 2 : " + action + " " + item);
	}

}
