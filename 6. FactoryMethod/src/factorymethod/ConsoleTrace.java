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
public class ConsoleTrace extends AbtractTrace {

    @Override
    public void debug(String message) {
        if (getDebug()) {
            System.out.println("[DEBUG]: " + message);
        }
    }

    @Override
    public void error(String message) {
        if (getDebug()) {
            System.err.println("[ERROR]: " + message);
        }
    }

}
