/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author 984571
 */
public class DecoratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractListProfileDecorator<String> arrayListProfile = new ListProfileDecorator<>(new ArrayList<String>());
        for(int i = 0; i < 100; i++){
            arrayListProfile.add("ABC "+i);
        }
        arrayListProfile.size();
        arrayListProfile.remove("ABC 0");
        arrayListProfile.contains("ABC 100");
        
        AbstractListProfileDecorator<String> linkedListProfile = new ListProfileDecorator<>(new LinkedList<String>());
        for(int i = 0; i < 100; i++){
            linkedListProfile.add("ABC "+i);
        }
        linkedListProfile.size();
        linkedListProfile.remove("ABC 0");
        linkedListProfile.contains("ABC 100");
    }
    
}
