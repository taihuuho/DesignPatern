package command;

public interface ICommand {
	public void execute(String params);
	public void undo();
}
