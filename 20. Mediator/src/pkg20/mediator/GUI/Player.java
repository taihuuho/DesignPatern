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
public abstract class Player {
    
    int moves;
    int pieces;
    
    public abstract ChessCell playNextTurn(ChessCell[][] chesses);

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
   
    
}
