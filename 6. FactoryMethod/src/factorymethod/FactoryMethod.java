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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length == 0){
            System.err.println("Please specify the Trace type.\n Usage: traceType\n traceType: 'console', 'name.log'");
            return;
        }
        
        Trace trace = TraceDebuggerFactory.getFactory().createDebugger(args[0]);
        
        trace.setDebug(true);
        trace.debug("Debug Message");
        trace.error("Error message");
    }
    
}
