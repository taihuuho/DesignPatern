/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mememto;

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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import mememto.pattern.CareTaker;
import mememto.pattern.Originator;
import mememto.pattern.User;

/**
 *
 * @author 984571
 */
public class MememtoClient extends Application {

    private User savedState = null;

    private final Originator originator = new Originator();
    private final CareTaker careTaker = new CareTaker();

    private TextField firstNameTextField = null;
    private TextField lastNameTextField = null;
    private TextField ageTextField = null;

    public void setSavedState(User savedState) {
        this.savedState = savedState;
        this.originator.setState(savedState);
    }

    @Override
    public void start(Stage primaryStage) {

        // create grid to 
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(20);

        Label firstNameLabel = new Label("First Name: ");
        Label lastNameLabel = new Label("Last Name: ");
        Label ageLabel = new Label("Age: ");

        firstNameTextField = new TextField();

        lastNameTextField = new TextField();
        ageTextField = new TextField();

        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameTextField, 1, 0);

        grid.add(lastNameLabel, 0, 1);
        grid.add(lastNameTextField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageTextField, 1, 2);

        // 3 buttons
        Button loadButton = new Button("Load");
        loadButton.setOnAction(new EventHandler() {

            @Override
            public void handle(Event t) {
                // load from database and display
                displayState();
            }
        });
        Button undoButton = new Button("Undo");
        undoButton.setOnAction(new EventHandler() {

            @Override
            public void handle(Event t) {
               originator.setMememtor(careTaker.getLatestState());
				careTaker.remove(careTaker.getMememtoesStack().size()-1);
				
				if (careTaker.getMememtoesStack().size() > 0) {
					originator.setState(careTaker.get(careTaker.getMememtoesStack().size()-1).getState());
				} else {
				}
                displayState();
            }
        });

        Button saveButton = new Button("Save");
        saveButton.setOnAction(new EventHandler() {

            @Override
            public void handle(Event t) {
                setSavedState(careTaker.getLatestState().getState());
            }
        });

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().addAll(loadButton, undoButton, saveButton);
        grid.add(hBox, 1, 3);

        // timer for keepng track statuses
        Timeline timer = new Timeline(new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("this is called every 2 seconds on UI thread");
                originator.setState(new User(firstNameTextField.getText(), lastNameTextField.getText(), ageTextField.getText()));
                careTaker.add(originator.createMememto());
            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();

        StackPane root = new StackPane();
        root.getChildren().add(grid);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Mememto Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayState() {
        firstNameTextField.setText(originator.getState().getFirstName());
        lastNameTextField.setText(originator.getState().getLastName());
        ageTextField.setText(originator.getState().getAge());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
