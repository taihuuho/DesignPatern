/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pkg20.mediator.MediatorClient;

/**
 *
 * @author 984571
 */
public class WhiteChess extends Chessman{

    public WhiteChess(int w, int row, int column) {
        super(w, row, column);
        setStyle("-fx-background-color: #FFFFFF;");
        ImageView img = new ImageView(ResourceRepository.black);
        img.setFitHeight(w-5);
        img.setFitWidth(w-5);
        setGraphic(img);
    }
}
