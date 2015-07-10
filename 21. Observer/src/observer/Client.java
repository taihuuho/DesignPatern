package observer;

public class Client {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("-- Demo Stack With Observer Application --");
		System.out.println();
		Stack stack = new Stack();
		// register observers...
		new Observer1(stack);
		new Observer2(stack);
		// test change data ...
		stack.push("5");
		stack.push("2");
		stack.push("7");
		stack.pop();
		stack.push("10");
		stack.pop();
		stack.pop();
	}

}
