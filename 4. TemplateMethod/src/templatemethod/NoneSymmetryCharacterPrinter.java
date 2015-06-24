/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.List;

/**
 *
 * @author 984571
 */
public class NoneSymmetryCharacterPrinter extends CharacterPrinter{

    public NoneSymmetryCharacterPrinter(List<String> input) {
        super(input);
    }

    @Override
    protected void recontructCharacter() {
        this.output = input;
    }
    
}
