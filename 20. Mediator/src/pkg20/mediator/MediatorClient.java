/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pkg20.mediator.GUI.ReversiSquare;

/**
 *
 * @author 984571
 */
public class MediatorClient extends Application {

    Label playerMove;
    Label playerPieces;
    Label computerMove;
    Label computerPieces;
    
    ReversiSquare square;

    @Override
    public void start(Stage primaryStage) {

        Scene gameUI = buildUI();
        primaryStage.setTitle("Reversi");
        primaryStage.getIcons().add(new Image(MediatorClient.class.getResource("reversi.png" ).toExternalForm()));
        primaryStage.setScene(gameUI);
        primaryStage.show();
    }

    private Scene buildUI(){
    StackPane root = new StackPane();
        
        root.setStyle("-fx-border-color: black;");
        Scene scene = new Scene(root, 500, 500);

        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("chessman.css").toExternalForm());

        // New game
        Button newGame = new Button("New Game");
        newGame.setMinWidth(100);
        newGame.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // restart game
            }
        });

        // New game
        Button option = new Button("Option");
        option.setMinWidth(100);
        option.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // Option
            }
        });

        HBox hBox0 = new HBox(20);
        hBox0.getChildren().addAll(newGame, option);
        hBox0.setAlignment(Pos.CENTER);
        // Game Square
        square = new ReversiSquare(400);

        HBox hBox = new HBox(20);
        playerMove = new Label("Player Moves: 0");
        playerPieces = new Label("Player Pieces: 0");
        computerMove = new Label("Computer Moves: 0");
        computerPieces = new Label("Computer Pieces: 0");
        hBox.getChildren().addAll(playerMove, playerPieces, computerMove, computerPieces);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(hBox0, hBox, square);

        root.getChildren().add(vBox);
        
        return scene;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
