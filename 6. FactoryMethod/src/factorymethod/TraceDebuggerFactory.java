/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 984571
 */
public class TraceDebuggerFactory implements DebuggerFactory{
  
    private static final TraceDebuggerFactory factory = new TraceDebuggerFactory();
    
    
    private TraceDebuggerFactory(){
    
    }
    
    public static TraceDebuggerFactory getFactory(){
        return factory;
    }
    
    @Override
    public Trace createDebugger(String debuggerType) {
        if (debuggerType.contains(".log")) {
            try {
                return new FileTrace(debuggerType);
            } catch (IOException ex) {
                Logger.getLogger(TraceDebuggerFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return new ConsoleTrace();
        }
        return null;
    }
    
}
