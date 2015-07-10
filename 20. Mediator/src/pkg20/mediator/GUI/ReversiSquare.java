/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;


/**
 *
 * @author 984571
 */
public class ReversiSquare extends GridPane implements EventHandler<ActionEvent>{
    static final int COLUMNS = 8;
    static final int ROWS = 8;
    
    static final int NUMBER_OF_SEED = 4;
    
    Player you;
    
    Player competitor;
    
    ChessCell[][] chesscells = new ChessCell[ROWS][COLUMNS];

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
                    chesscells[i][j] = blackChess;
                }else{
                    WhiteCell whiteChess = new WhiteCell(squareW, i, j);
                    whiteChess.setOnAction(this);
                    add(whiteChess, j, i);
                    chesscells[i][j] = whiteChess;
                }
            }
        }
        
        start();
    }
    
    public final void start(){
        seed();
    }
    
    private void seed(){
        
        for(int row = ROWS/2 - NUMBER_OF_SEED/4; row < ROWS/2 + NUMBER_OF_SEED/4; row++){
            for (int column = COLUMNS/2 - NUMBER_OF_SEED/4; column < COLUMNS/2 + NUMBER_OF_SEED/4; column++) {
                if (chesscells[row][column] instanceof BlackCell) {
                    chesscells[row][column].playChess(ChessColorType.WHITE);
                }else{
                    chesscells[row][column].playChess(ChessColorType.BLACK);
                }
            }
        }
    }
    
    public void restartGame(){
        
    }
    
    public void gameOver(){
        
    }
    
    public void update(){
        // update Moves, Pieces counter
    }

    @Override
    public void handle(ActionEvent event) {
        int move =  you.getMoves();
        you.setMoves(move++);
        ChessCell chessMan = (ChessCell)event.getSource();
        System.out.println(chessMan);
        if (chessMan.getType() == ChessColorType.BLANK) {
            chessMan.playChess(Config.yourColor);
            int pieces = you.getPieces();
            you.setPieces(pieces++);
            
            competitor.playNextTurn(chesscells);
        }
        update();
    }
}
