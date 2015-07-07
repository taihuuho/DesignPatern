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
public class GravelState implements LevelState{
    private final GameContext context;

    public GravelState(GameContext context) {
        this.context = context;
    }
    @Override
    public int left() {
        return 3;
    }

    @Override
    public int accel() {
        return 7;
    }

    @Override
    public int right() {
        return 3;
    }

    @Override
    public int brake() {
        return 6;
    }
    
}
