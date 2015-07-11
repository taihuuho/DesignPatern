/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984571
 */
public abstract class Player {
    
    private int moves;
    private int pieces;
    
    List<ChessCell> movedCells = new ArrayList<>();
    
    protected ChessColorType color;
    
    public abstract ChessCell playNextTurn(ChessCell[][] chesses);

    public void placeCell(ChessCell cell){
        cell.playChess(color);
        movedCells.add(cell);
    }
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

    public ChessColorType getColor() {
        return color;
    }

    public void setColor(ChessColorType color) {
        this.color = color;
    }

    public List<ChessCell> getMovedCells() {
        return movedCells;
    }

    public void setMovedCells(List<ChessCell> movedCells) {
        this.movedCells = movedCells;
    }
    
}
