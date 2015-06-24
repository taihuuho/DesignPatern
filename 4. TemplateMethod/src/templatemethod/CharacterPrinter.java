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
public abstract class CharacterPrinter {
    
    public static final Integer MAX_ROW = 20;
    public static final Integer MAX_COLUMN = 10;
    
    
    protected List<String> input;
    
    protected List<String> output;

    protected abstract void recontructCharacter();
    
    public CharacterPrinter(List<String> input) {
        this.input = input;
    }
    
    private void print(){
        if (output != null){
            for (String row : output) {
                System.out.println(row);
            }
        }
    }
    
    public void resolve(){
        recontructCharacter();
        print();
    }
}
