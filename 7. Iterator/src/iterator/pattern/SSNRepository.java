/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.pattern;

/**
 *
 * @author 984571
 */
public class SSNRepository implements Aggregate {

    private final String SSNs[] = {"943-333-5543", "943-333-5544", "943-333-5545", "943-333-5546", "943-333-5547", "943-333-5548"};

    @Override
    public Iterator getIterator() {
        return new SSNIterator();
    }

    private class SSNIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < SSNs.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return SSNs[index++];
            }
            return null;
        }

    }
}
