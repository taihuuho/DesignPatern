/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.scene.control.Button;

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
    
}
