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
public class ResourceRepository {
    public static Image black = new Image(MediatorClient.class.getResource("black.png" ).toExternalForm());
    public static Image white = new Image(MediatorClient.class.getResource("white.png" ).toExternalForm());
}
