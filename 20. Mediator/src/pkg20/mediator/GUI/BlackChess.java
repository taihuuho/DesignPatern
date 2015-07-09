/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.scene.image.ImageView;

/**
 *
 * @author 984571
 */
public class BlackChess extends Chessman {
    
    public BlackChess(int w, int row, int column) {
        super(w, row, column);
        setStyle("-fx-background-color: green;");
        ImageView img = new ImageView(ResourceRepository.white);
        img.setFitHeight(w-5);
        img.setFitWidth(w-5);
        setGraphic(img);
    }

}
