/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author 984571
 */
public class Composite extends Component {

    private final Collection<Component> list = new ArrayList<>();

    public Composite(String title) {
        super(title);
    }

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
        // re identify the top left and bottom right coordinates
        reIdentifyCoordinatesAfterOperatingComponent(component);
    }

    @Override
    public void removeChild(Component component) {
        list.remove(component);

        for (Component comp : list) {
            reIdentifyCoordinatesAfterOperatingComponent(comp);
        }
    }

    private void reIdentifyCoordinatesAfterOperatingComponent(Component component) {
        if (topLeft.getX() > component.getTopLeft().getX()) {
            topLeft.setX(component.getTopLeft().getX());
        }
        if (topLeft.getY() > component.getTopLeft().getY()) {
            topLeft.setY(component.getTopLeft().getY());
        }

        if (bottomRight.getX() < component.getBottomRight().getX()) {
            bottomRight.setX(component.getBottomRight().getX());
        }
        if (topLeft.getY() < component.getBottomRight().getY()) {
            topLeft.setY(component.getBottomRight().getY());
        }
    }

    @Override
    public Collection<Component> getAllImmediateChildren() {
        return list;
    }
}
