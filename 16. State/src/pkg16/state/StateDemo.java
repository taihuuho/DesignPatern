/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.state;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
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

    GameContext gameContext = new GameContext(this);
    
    public void setEffectArtribyraryScale(String str) {
        effectArbitraryScaleTextField.setText(str);
    }

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
        regularRadio.setSelected(true);
        regularRadio.setToggleGroup(group);
        regularRadio.setUserData(gameContext.getRegularState());
        
        final RadioButton gravelRadio = new RadioButton("Gravel");
        gravelRadio.setToggleGroup(group);
        gravelRadio.setUserData(gameContext.getGravelState());
        
        final RadioButton wetRadio = new RadioButton("Wet");
        wetRadio.setToggleGroup(group);
        wetRadio.setUserData(gameContext.getWetState());
        
        final RadioButton iceRadio = new RadioButton("Ice");
        iceRadio.setToggleGroup(group);
        iceRadio.setUserData(gameContext.getIceState());

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
           @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) {
               if (group.getSelectedToggle() != null) {
                    gameContext.setState((LevelState)group.getSelectedToggle().getUserData());
                } 
            }
        });

        grid.add(regularRadio, 0, 0);
        grid.add(gravelRadio, 0, 1);
        grid.add(wetRadio, 0, 2);
        grid.add(iceRadio, 0, 3);

        
        // 4 buttons
        final Button leftButton = new Button("Left");
        leftButton.setOnAction(gameContext.getLeftHandler());
        final Button accelButton = new Button("Accel");
        accelButton.setOnAction(gameContext.getAccelHandler());
        final Button rightButton = new Button("Right");
        rightButton.setOnAction(gameContext.getRightHandler());
        final Button brakeButton = new Button("Brake");
        brakeButton.setOnAction(gameContext.getBrakeHandler());

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(leftButton, accelButton, rightButton, brakeButton);
        grid.add(hBox, 0, 4, 2, 1);

        effectArbitraryScaleTextField = new TextField();
        grid.add(effectArbitraryScaleTextField, 1, 3);

        StackPane root = new StackPane();
        root.getChildren().add(grid);

        Scene scene = new Scene(root, 500, 350);

        primaryStage.setTitle("State Demo");
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
