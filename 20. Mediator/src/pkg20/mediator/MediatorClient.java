/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pkg20.mediator.GUI.Chessman;
import pkg20.mediator.GUI.ReversiSquare;

/**
 *
 * @author 984571
 */
public class MediatorClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 350, 320);
        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("chessman.css").toExternalForm());
        
        // New game
        Button newGame = new Button("New Game");
        newGame.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // restart game
            }
        });
        root.getChildren().add(newGame);
        
        // Game Square
        ReversiSquare square = new ReversiSquare(320);
        
        root.getChildren().add(square);
        
        primaryStage.setTitle("Reversi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
