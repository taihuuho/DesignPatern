/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import javafx.scene.layout.GridPane;


/**
 *
 * @author 984571
 */
public class ReversiGUI extends GridPane{
    static final int COLUMNS = 8;
    static final int ROWS = 8;

    public ReversiGUI() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                add(new Chessman(), j, i);
            }
        }
    }
}
