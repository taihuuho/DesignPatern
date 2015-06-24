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
    
    protected List<String> input;
    
    protected char[][] output;

    protected abstract void recontructCharacter();
    
    public CharacterPrinter(List<String> input) {
        this.input = input;
    }
    
    private void print(){
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] row : output) {
            stringBuilder.delete(0, stringBuilder.length());
            for (int j = 0; j < row.length; j++) {
                stringBuilder.append(row[j]);
            }
            System.out.println(stringBuilder.toString());
        }
    }
    
    public void resolve(){
        recontructCharacter();
        print();
    }
}
