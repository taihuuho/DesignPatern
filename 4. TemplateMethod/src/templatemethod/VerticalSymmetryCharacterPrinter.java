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
public class VerticalSymmetryCharacterPrinter extends CharacterPrinter {

    public VerticalSymmetryCharacterPrinter(List<String> input) {
        super(input);
    }

    @Override
    protected void recontructCharacter() {
        int capacity = input.size() * 2;
        output = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            if (i < input.size()) {
                output.add(input.get(i));
            }else{
                int index = capacity - i - 1;
                if (index >= 0 && index < input.size()){
                    output.add(input.get(index));
                }else{
                    output.add(input.get(0));
                }
            }
        }
    }
    
}
