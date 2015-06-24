/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984571
 */
public class HorizontalSymmetryCharacterPrinter extends CharacterPrinter {

    public HorizontalSymmetryCharacterPrinter(List<String> input) {
        super(input);
    }

    @Override
    protected void recontructCharacter() {
        output = new ArrayList<>(input.size());
        for (String string : input) {
            char[] chars = new char[MAX_COLUMN];
            string.getChars(0, string.length(), chars, 0);
            int length = chars.length;
            for (int i = 0; i < length/2; i++) {
                chars[length - i - 1] = chars[i];
            }
            output.add(new String(chars));
        }
    }
    
}
