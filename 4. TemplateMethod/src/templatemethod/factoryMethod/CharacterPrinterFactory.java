/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod.factoryMethod;

import java.io.IOException;
import templatemethod.CharacterPrinter;
/**
 *
 * @author 984571
 */
public interface CharacterPrinterFactory {
    
    public CharacterPrinter createCharacterPrinterFromFile(String filePath) throws IOException;
}
