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
public interface Trace {

    // turn on and off debugging

    public void setDebug(boolean debug);

    // write out a debug message

    public void debug(String message);

    // write out an error message

    public void error(String message);
}
