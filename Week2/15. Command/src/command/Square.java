package command;

public class Square {
	private int side;
	private String param;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public void create(String side) {
		// save param or undo
		this.param = side;
		System.out.println("Create Square " + Integer.parseInt(side));
	}

	public void scale(String scaleFactor) {
		this.param = scaleFactor;
		System.out.println("Scale Square " + Integer.parseInt(scaleFactor));
	}
	
	public void move(String move) {
		this.param = move;
		System.out.println("Move Square " + move);
	}
	
	public void undoCreate() {
		System.out.println("Undo - Create Square " + this.param);
	}
	
	public void undoScale() {
		System.out.println("Undo - Scale Square with " + this.param);
	}
	
	public void undoMove() {
		System.out.println("Undo - Move Square " + this.param);
	}
}
