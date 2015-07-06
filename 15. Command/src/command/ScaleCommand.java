package command;

public class ScaleCommand implements ICommand {
	private Square square;

	public ScaleCommand(Square square) {
		this.setSquare(square);
	}

	@Override
	public void execute(String param) {
		// TODO Auto-generated method stub
		square.scale(param);	
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		square.undoScale();
	}

}
