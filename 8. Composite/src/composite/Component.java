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

    public Component(String title) {
        this.title = title;
        this.topLeft = new Coordinate();
        this.bottomRight = new Coordinate();
        this.height = 0;
    }

    public Coordinate getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Coordinate topLeft) {
        this.topLeft = topLeft;
    }

    public Coordinate getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Coordinate bottomRight) {
        this.bottomRight = bottomRight;
    }
    
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
