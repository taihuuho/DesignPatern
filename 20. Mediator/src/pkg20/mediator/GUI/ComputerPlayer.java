/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

/**
 *
 * @author 984571
 */
public class ComputerPlayer extends Player{

    public ComputerPlayer() {
        color = ChessColorType.WHITE;
    }

    @Override
    public ChessCell playNextTurn(ChessCell[][] chesses) {
        return null;
    }
}
