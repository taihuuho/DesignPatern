/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author 984571
 */
public class CommandClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square square = new Square();
        ICommand createCmd = new CreateCommand(square);
        ICommand scaleCmd = new ScaleCommand(square);
        ICommand moveCmd = new MoveCommand(square);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(createCmd, "5");
        remote.pressButton();
        remote.pressUndoButton();

        remote.setCommand(scaleCmd, "2");
        remote.pressButton();
        remote.pressUndoButton();

        remote.setCommand(moveCmd, "left 10");
        remote.pressButton();

        remote.setCommand(moveCmd, "right 5");
        remote.pressButton();
        remote.pressUndoButton();
    }

}
