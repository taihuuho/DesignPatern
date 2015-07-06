package command;

public class CreateCommand implements ICommand {
	private Square square;

	public CreateCommand(Square square) {
		this.setSquare(square);
	}

	public void execute(String param) {
		square.create(param);
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	@Override
	public void undo() {
		square.undoCreate();

	}
}
