/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 984571
 */
public abstract class Component {

    private Collection<Component> list = new ArrayList<Component>();
    protected String title;

    public abstract void print();

    public void addItem(Component item) {
        list.add(item);
    }
    
    public void addChild(Component component){
        
    }
}
