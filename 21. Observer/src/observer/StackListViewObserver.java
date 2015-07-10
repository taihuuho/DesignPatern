/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

/**
 *
 * @author taiho
 */
public class StackListViewObserver extends ListView<String> implements Observer{

    public StackListViewObserver(Stack stack) {
        stack.attach(this);
    }

    @Override
    public void update(String action, String item, List<String> items) {
        
        setItems(FXCollections.observableArrayList(items));
    }    
}
