/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 984571
 */
public class ObserverClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        

        final Stack stack = new Stack();
        // register observers...
        
        

        StackListViewObserver listView  =  new StackListViewObserver(stack);
        

        // test change data ...
        stack.push("5");
        stack.push("2");
        stack.push("7");
        stack.push("10");
        
        final TextField nameTextField = new TextField();
        
        Button pushButton = new Button("Push");
        pushButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(nameTextField.getText() != null && !nameTextField.getText().trim().isEmpty()){
                    stack.push(nameTextField.getText());
                }
            }
        });
        
        Button popButton = new Button("Pop");
        popButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stack.pop();
            }
        });
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        
        grid.add(nameTextField, 0, 0);
        grid.add(pushButton, 1, 0);
        grid.add(popButton, 2, 0);
        grid.add(listView, 0, 1);
        
        StackPane root = new StackPane();
        root.getChildren().add(grid);
        
        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Observer");
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
