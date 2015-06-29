/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.Collection;

/**
 *
 * @author 984571
 */
public class Leaf extends Component {

    public Leaf(String title) {
        super(title);
    }

    @Override
    public void print() {
        this.assignHeight();
        System.out.println("Render Element: " + title + " [width = " + getWidth() + ", height: " + this.height + "]");
    }

    @Override
    public void addChild(Component component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeChild(Component component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Component> getAllImmediateChildren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getWidth(){
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    @Override
    public void assignHeight(){
        this.height =  Math.abs(topLeft.getY() - bottomRight.getY());
    }
}
