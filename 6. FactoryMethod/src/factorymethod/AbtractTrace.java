/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author 984571
 */
public abstract class AbtractTrace implements Trace{

    private boolean debug = true;
    
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }
    
    protected boolean getDebug(){
        return debug;
    }
}
