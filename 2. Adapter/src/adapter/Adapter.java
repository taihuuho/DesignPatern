/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author 984571
 */
public class Adapter implements StackTarget, QueueTarget {

    private final Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void push(String string) {
        adaptee.add(string);
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String endElement = adaptee.endString();
            adaptee.remove(adaptee.getEnd());
            return endElement;
        }
    }

    @Override
    public void enqueue(String string) {
        adaptee.add(string);
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            String startElement = adaptee.startString();
            adaptee.remove(adaptee.getStart());

            return startElement;
        }

    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }

    @Override
    public String toString() {
        return adaptee.toString();
    }
}
