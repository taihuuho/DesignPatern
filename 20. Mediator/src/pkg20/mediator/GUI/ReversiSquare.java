/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;


/**
 *
 * @author 984571
 */
public class ReversiSquare extends GridPane{
    static final int COLUMNS = 8;
    static final int ROWS = 8;
    
    Chessman[][] chessmen = new Chessman[ROWS][COLUMNS];

    public ReversiSquare(int w) {
        setPrefSize(w, w+1);
        setMinWidth(w);
        setMinHeight(w+1);
        setMaxHeight(w+3);
        setMaxWidth(w+2);
        setStyle("-fx-border-color: black;");
        
        int squareW = w/COLUMNS;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if((i+j)%2 == 0){
                    Chessman blackChess = new BlackChess(squareW, i, j);
                    add(blackChess, j, i);
                    chessmen[i][j] = blackChess;
                }else{
                    WhiteChess whiteChess = new WhiteChess(squareW, i, j);
                    add(whiteChess, j, i);
                    chessmen[i][j] = whiteChess;
                }
            }
        }
    }
}
