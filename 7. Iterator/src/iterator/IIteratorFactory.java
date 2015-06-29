/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import iterator.pattern.Aggregate;
import iterator.pattern.Iterator;

/**
 *
 * @author 984571
 */
public interface IIteratorFactory {
    
    public Iterator createIterator(Aggregate aggregate);
}
