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

public abstract class Chessman extends Button{

    int row;
    int column;
    
    public Chessman(int w, int row, int column) {
        setPrefSize(w, w);
        setMinWidth(w);
        setMinHeight(w);
        this.row = row;
        this.column = column;
        
    }
    
    public void playChess(ChessType type){
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
        
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(getPrefHeight()-5);
        imgView.setFitWidth(getPrefWidth()-5);
        setGraphic(imgView);
    }
    
}
