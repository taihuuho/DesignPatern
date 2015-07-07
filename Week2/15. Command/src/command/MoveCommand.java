package command;

public class MoveCommand implements ICommand {
	private Square square;

	public MoveCommand(Square square) {
		this.setSquare(square);
	}

	public void execute(String param) {
		square.move(param);
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}
	
	@Override
	public void undo() {
		square.undoMove();

	}

}
