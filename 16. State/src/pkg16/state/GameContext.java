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

    StateDemo GUI;

    private LevelState regularState;
    private LevelState gravelState;
    private LevelState wetState;
    private LevelState iceState;

    private LevelState state;

    // event handlers
    
    private LeftHandler leftHandler;
    private RightHandler rightHandler;
    private AccelHandler accelHandler;
    private BrakeHandler brakeHandler;

    public GameContext(StateDemo GUI) {
        this.GUI = GUI;
        state = getRegularState();
    }

    public LevelState getState() {
        return state;
    }

    public LeftHandler getLeftHandler() {
        if (leftHandler == null) {
            leftHandler = new LeftHandler();
        }
        return leftHandler;
    }

    public RightHandler getRightHandler() {
        if (rightHandler == null) {
            rightHandler = new RightHandler();
        }
        return rightHandler;
    }

    public AccelHandler getAccelHandler() {
        if (accelHandler == null) {
            accelHandler = new AccelHandler();
        }
        return accelHandler;
    }

    public BrakeHandler getBrakeHandler() {
        if (brakeHandler == null) {
            brakeHandler = new BrakeHandler();
        }
        return brakeHandler;
    }
    
    

    public LevelState getRegularState() {
        if (regularState == null) {
            regularState = new RegularState(this);
        }
        return regularState;
    }

    public LevelState getGravelState() {
        if (gravelState == null) {
            gravelState = new GravelState(this);
        }
        return gravelState;
    }

    public LevelState getWetState() {
        if (wetState == null) {
            wetState = new WetState(this);
        }
        return wetState;
    }

    public LevelState getIceState() {
        if (iceState == null) {
            iceState = new IceState(this);
        }
        return iceState;
    }

    public void setState(LevelState state) {
        this.state = state;
    }


    private class LeftHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            GUI.setEffectArtribyraryScale(getState().getClass().getSimpleName() + " Left: " + getState().left());
        }
    }

    private class RightHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            GUI.setEffectArtribyraryScale(getState().getClass().getSimpleName() + " Right: " + getState().right());
        }
    }
    
    private class AccelHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            GUI.setEffectArtribyraryScale(getState().getClass().getSimpleName() + " Accel: " + getState().accel());
        }
    }
    
    private class BrakeHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            GUI.setEffectArtribyraryScale(getState().getClass().getSimpleName() + " Brake: " + getState().brake());
        }
    }
}
