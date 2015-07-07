package command;

public class RemoteControl {
	private ICommand command;
	private ICommand undoCommand;
	private String param;

	public void setCommand(ICommand command, String commandString) {
		this.command = command;
		this.param = commandString;
		//this.command
	}

	public void pressButton() {
		command.execute(param);
		
		// keep for undo function later
		undoCommand = command;
	}
	
	public void pressUndoButton() {
		undoCommand.undo();
	}
}
