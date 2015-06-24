/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.io.IOException;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        CharacterPrinterFactory factory = new SymmetryCharacterPrinterFactory();
        
        CharacterPrinter printer1 = factory.createCharacterPrinterFromFile("src/1.txt");
        CharacterPrinter printer2 = factory.createCharacterPrinterFromFile("src/2.txt");
        CharacterPrinter printer3 = factory.createCharacterPrinterFromFile("src/3.txt");
        
        System.out.println("----- Process 1.txt -----");
        printer1.resolve();
        
        System.out.println("----- Process 2.txt -----");
        printer2.resolve();
        
        System.out.println("----- Process 3.txt -----");
        printer3.resolve();
    }
    
}
