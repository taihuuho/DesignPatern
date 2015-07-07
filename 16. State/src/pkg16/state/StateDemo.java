/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.state;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 984571
 */
public class StateDemo extends Application {
    
    private TextField effectArbitraryScaleTextField;
    
    @Override
    @SuppressWarnings("empty-statement")
    public void start(Stage primaryStage) {
        // create grid to 
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(20);

        // create 4 choices: Regular, Gravel, Wet, Ice
        final ToggleGroup group = new ToggleGroup();
        final RadioButton regularRadio = new RadioButton("Regular");
        regularRadio.setToggleGroup(group);
        final RadioButton gravelRadio = new RadioButton("Gravel");
        gravelRadio.setToggleGroup(group);
        final RadioButton wetRadio = new RadioButton("Wet");
        wetRadio.setToggleGroup(group);
        final RadioButton iceRadio = new RadioButton("Ice");
        iceRadio.setToggleGroup(group);
        
        grid.add(regularRadio, 0, 0);
        grid.add(gravelRadio, 0, 1);
        grid.add(wetRadio, 0, 2);
        grid.add(iceRadio, 0, 3);
        
        effectArbitraryScaleTextField = new TextField();
        
        GameContext gameContext = new GameContext();
        // 4 buttons
        final Button leftButton = new Button("Left");
        leftButton.setOnAction(null);
        final Button accelButton = new Button("Accel");
        final Button rightButton = new Button("Right");
        final Button brakeButton = new Button("Brake");
        
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(leftButton, accelButton, rightButton, brakeButton);
        grid.add(hBox, 0, 4);
        
        StackPane root = new StackPane();
        root.getChildren().add(grid);
        
        Scene scene = new Scene(root, 500, 350);
        
        primaryStage.setTitle("Hello World!");
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
