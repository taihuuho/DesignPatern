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
public class Composite extends Component {
    private final Collection<Component> list = new ArrayList<>();
    
    @Override
    public void print() {
        this.assignHeight();
        System.out.println("Render Element: " + title + " [width = " + getWidth() + ", height: " + this.height + "]");
        
        for (Component com : list) {
            com.assignHeight();
            System.out.print("\t");
            com.print();

        }
    }

    @Override
    public void addChild(Component component) {
        list.add(component);
    }

    @Override
    public void removeChild(Component component) {
        list.remove(component);
        
        // re identify
    }

    @Override
    public Collection<Component> getAllImmediateChildren() {
        return list;
    }
}
