/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author 984571
 */

public abstract class ChessCell extends Button{

    int row;
    int column;
    
    ChessColorType type;
    
    private boolean canPlaceChess;
    
    private boolean placed;
    
    private boolean hinted;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public ChessColorType getType() {
        return type;
    }

    public boolean isCanPlaceChess() {
        return canPlaceChess && getType() == ChessColorType.BLANK;
    }

    public void setCanPlaceChess(boolean canPlaceChess) {
        this.canPlaceChess = canPlaceChess;
    }

    public boolean isPlaced() {
        return placed;
    }
    
    public boolean canHint(){
        return isCanPlaceChess();
    }

    public boolean isHinted() {
        return hinted;
    }

    public void setHinted(boolean hinted) {
        this.hinted = hinted;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }
    
    public boolean hasTopCell(){
        return row > 0;
    }
    
    public boolean hasBottomCell(){
        return row < ReversiSquare.ROWS - 1;
    }
    
    public boolean hasLeftCell(){
        return column > 0;
    }
    
    public boolean hasRightCell(){
        return column < ReversiSquare.COLUMNS - 1;
    }
    
    public boolean hasTopLeftCell(){
        return row > 0 && column > 0;
    }
    
    public boolean hasTopRightCell(){
        return row > 0 && column < ReversiSquare.COLUMNS - 1;
    }
    
    public boolean hasBottomLeftCell(){
        return row < ReversiSquare.ROWS - 1 && column > 0;
    }
    
    public boolean hasBottomRightCell(){
        return row < ReversiSquare.ROWS - 1 && column < ReversiSquare.COLUMNS - 1;
    }

    public ChessCell(int w, int row, int column) {
        type = ChessColorType.BLANK;
        canPlaceChess = false;
        placed = false;
        
        setPrefSize(w, w);
        setMinWidth(w);
        setMinHeight(w);
        this.row = row;
        this.column = column;
        
    }
    
    public void playChess(ChessColorType type){
        this.type = type;
        Image img = null;
        switch(type){
            case BLANK:
                break;
            case BLACK:
                img = ResourceRepository.black;
                break;
            case WHITE:
                img = ResourceRepository.white;
                break;
        }
        placed = img != null;
        canPlaceChess = img == null;
        
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(getPrefHeight()-5);
        imgView.setFitWidth(getPrefWidth()-5);
        setGraphic(imgView);
    }

    @Override
    public String toString() {
        return "cell["+row+","+column+"]";
    }
}
