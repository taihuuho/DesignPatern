/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.state;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author 984571
 */
public class GameContext {

    private LevelState regularState;
    private LevelState gravelState;
    private LevelState wetState;
    private LevelState iceState;

    private LevelState state;

    // event handlers
    private RegularHandler regularHandler;
    private GravelHandler gravelHandler;
    private WetHandler wetHandler;
    private IceHandler iceHandler;

    public LevelState getState() {
        return state;
    }

    public RegularHandler getRegularHandler() {
        if (regularHandler == null) {
            regularHandler = new RegularHandler();
        }
        return regularHandler;
    }

    public GravelHandler getGravelHandler() {
        if (gravelHandler == null) {
            gravelHandler = new GravelHandler();
        }
        return gravelHandler;
    }

    public WetHandler getWetHandler() {
        if (wetHandler == null) {
            wetHandler = new WetHandler();
        }
        return wetHandler;
    }

    public IceHandler getIceHandler() {
        if (iceHandler == null) {
            iceHandler = new IceHandler();
        }
        return iceHandler;
    }

    private LevelState getRegularState() {
        if (regularState == null) {
            regularState = new RegularState(this);
        }
        return regularState;
    }

    private LevelState getGravelState() {
        if (gravelState == null) {
            gravelState = new GravelState(this);
        }
        return gravelState;
    }

    private LevelState getWetState() {
        if (wetState == null) {
            wetState = new WetState(this);
        }
        return wetState;
    }

    private LevelState getIceState() {
        if (iceState == null) {
            iceState = new IceState(this);
        }
        return iceState;
    }

    public void setState(LevelState state) {
        this.state = state;
    }

    private class RegularHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            setState(getRegularState());
        }
    }

    private class GravelHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            setState(getGravelState());
        }
    }

    private class WetHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            setState(getWetState());
        }
    }

    private class IceHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            setState(getIceState());
        }
    }

    private class LeftHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            
        }
    }
}
