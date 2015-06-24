/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import templatemethod.factoryMethod.CharacterPrinterFactory;
import templatemethod.factoryMethod.SymmetryCharacterPrinterFactory;
/**
 *
 * @author 984571
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CharacterPrinterFactory factory = new SymmetryCharacterPrinterFactory();
        
        CharacterPrinter printer1 = factory.createCharacterPrinterFromFile("1.txt");
        CharacterPrinter printer2 = factory.createCharacterPrinterFromFile("2.txt");
        CharacterPrinter printer3 = factory.createCharacterPrinterFromFile("3.txt");
        
        printer1.resolve();
        printer2.resolve();
        printer3.resolve();
    }
    
}
