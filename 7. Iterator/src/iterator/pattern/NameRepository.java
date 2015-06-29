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
public class NameRepository implements Aggregate {

    private final String names[][] = {
        {"Rob", "Jon", "-", "Lor", "Pat", "Ken"},
        {"-", "-", "-", "Lor", "-", "-"},
        {"Ken", "Pat", "-", "James", "-", "-", "-"}
    };

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        //Current index
        int row = 0;
        int col = 0;

        //Next index
        int nrow = 0;
        int ncol = 0;

        @Override
        public boolean hasNext() {
            int i = row;
            int j = col;

            //find next
            while (i < names.length) {
                while (j < names[i].length) {
                    if (!"-".equals(names[i][j])) {
                        nrow = i;
                        ncol = j;
                        return true;
                    }
                    j++;
                }
                i++;
                j = 0;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                row = nrow;
                col = ncol;
                return names[row][col++];
            }
            return null;
        }

    }
}
