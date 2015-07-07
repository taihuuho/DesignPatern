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
public class IceState implements LevelState {

    private final GameContext context;

    public IceState(GameContext context) {
        this.context = context;
    }

    @Override
    public int left() {
        return 1;
    }

    @Override
    public int accel() {
        return 3;
    }

    @Override
    public int right() {
        return 1;
    }

    @Override
    public int brake() {
        return 2;
    }

}
