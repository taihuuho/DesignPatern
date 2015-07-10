/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;


/**
 *
 * @author 984571
 */
public class ReversiSquare extends GridPane implements EventHandler<ActionEvent>{
    static final int COLUMNS = 8;
    static final int ROWS = 8;
    
    ChessCell[][] chessmen = new ChessCell[ROWS][COLUMNS];

    public ReversiSquare(int w) {
        setPrefSize(w, w+3);
        setMinWidth(w);
        setMinHeight(w+1);
        setMaxHeight(w+3);
        setMaxWidth(w+2);
        setStyle("-fx-border-color: black;");
        
        int squareW = w/COLUMNS;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if((i+j)%2 == 0){
                    ChessCell blackChess = new BlackCell(squareW, i, j);
                    blackChess.setOnAction(this);
                    add(blackChess, j, i);
                    chessmen[i][j] = blackChess;
                }else{
                    WhiteCell whiteChess = new WhiteCell(squareW, i, j);
                    whiteChess.setOnAction(this);
                    add(whiteChess, j, i);
                    chessmen[i][j] = whiteChess;
                }
            }
        }
        
        
    }
    
    public void start(){
        seed();
    }
    
    private void seed(){
        
    }
    
    public void restartGame(){
        
    }
    
    public void gameOver(){
        
    }

    @Override
    public void handle(ActionEvent event) {
        ChessCell chessMan = (ChessCell)event.getSource();
        System.out.println(chessMan);
    }
}
