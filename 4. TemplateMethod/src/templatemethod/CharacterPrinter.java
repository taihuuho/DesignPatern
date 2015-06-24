/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author 984571
 */
public abstract class CharacterPrinter {
    
    public void getInputFromFile(){
    }
    public abstract void recontructCharacter();
    
    public void print(){
    }
    
    public void resolve(){
        getInputFromFile();
        recontructCharacter();
        print();
    }
}
