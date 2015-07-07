/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.state;

/**
 *
 * @author 984571
 */
public class WetState implements LevelState {

    private final GameContext context;

    @Override
    public int left() {
        return 4;
    }

    public WetState(GameContext context) {
        this.context = context;
    }

    @Override
    public int accel() {
        return 9;
    }

    @Override
    public int right() {
        return 4;
    }

    @Override
    public int brake() {
        return 7;
    }

}
