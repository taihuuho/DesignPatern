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
public class BlackCell extends ChessCell {
    
    public BlackCell(int w, int row, int column) {
        super(w, row, column);
        setStyle("-fx-background-color: green;");
        
    }

}
