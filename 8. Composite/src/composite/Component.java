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

    
    protected String title;

    protected Coordinate topLeft;
    protected Coordinate bottomRight;
    
    protected float height;

    public abstract void print();

    public abstract void addChild(Component component);

    public abstract void removeChild(Component component);

    public abstract Collection<Component> getAllImmediateChildren();

    public float getWidth(){
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public void assignHeight(){
        this.height =  Math.abs(topLeft.getY() - bottomRight.getY());
    }
}
