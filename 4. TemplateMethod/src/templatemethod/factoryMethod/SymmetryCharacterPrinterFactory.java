/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod.factoryMethod;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import templatemethod.CharacterPrinter;
import templatemethod.HorizontalSymmetryCharacterPrinter;
import templatemethod.NoneSymmetryCharacterPrinter;
import templatemethod.VerticalSymmetryCharacterPrinter;

/**
 *
 * @author 984571
 */
public class SymmetryCharacterPrinterFactory implements CharacterPrinterFactory {
    //This factory should often times be a Singleton

    private static SymmetryCharacterPrinterFactory factory = new SymmetryCharacterPrinterFactory();

    private SymmetryCharacterPrinterFactory() {
    }

    public static SymmetryCharacterPrinterFactory getFactory() {
        return factory;
    }

    @Override
    public CharacterPrinter createCharacterPrinterFromFile(String filePath) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get(filePath), Charset.defaultCharset());

        CharacterPrinter printer = null;
        if (allLines.get(0).length() <= CharacterPrinter.MAX_COLUMN / 2) {
            printer = new HorizontalSymmetryCharacterPrinter(allLines);
        } else if (allLines.size() < CharacterPrinter.MAX_ROW / 2) {
            printer = new VerticalSymmetryCharacterPrinter(allLines);
        } else {
            printer = new NoneSymmetryCharacterPrinter(allLines);
        }
        return printer;
    }

}
