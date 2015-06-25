/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 984571
 */
public class FileTrace extends AbtractTrace {

    private PrintWriter filePrinter;
    
    public FileTrace() {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        filePrinter.close();
    }

    public FileTrace(String filePath) throws IOException  {
        filePrinter = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));
    }

    @Override
    public void debug(String message) {
        if (getDebug()) {
            filePrinter.write("[DEBUG]: " + message + "\n");
            filePrinter.flush();
        }
    }

    @Override
    public void error(String message) {
        if (getDebug()) {
            filePrinter.write("[ERROR]: " + message + "\n");
            filePrinter.flush();
        }

    }
}
