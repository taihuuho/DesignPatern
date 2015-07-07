/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.List;

/**
 *
 * @author 984571
 * @param <E>
 */
public class ListProfileDecorator<E> extends AbstractListProfileDecorator<E> {

    public ListProfileDecorator(List<E> decoratedList) {
        super(decoratedList);
    }

    @Override
    public boolean remove(Object o) {
        long start = System.nanoTime();
        boolean rs = decoratedList.remove(o);
        long end = (System.nanoTime() - start);
        System.out.println(decoratedList.getClass().getSimpleName() + " Executing method Remove(o) spent: " + end + " nanoseconds");
        return rs;
    }

    @Override
    public boolean add(E e) {
        long start = System.nanoTime();
        boolean rs = decoratedList.add(e);
        long end = (System.nanoTime() - start);
        System.out.println(decoratedList.getClass().getSimpleName() + " Executing method Add(e) spent: " + end + " nanoseconds");
        return rs;
    }

    @Override
    public boolean contains(Object o) {
       long start = System.nanoTime();
        boolean rs = decoratedList.contains(o);
        long end = (System.nanoTime() - start);
        System.out.println(decoratedList.getClass().getSimpleName() + " Executing method Contains(o) spent: " + end + " nanoseconds");
        return rs; 
    }

    @Override
    public int size() {
        long start = System.nanoTime();
        int rs = decoratedList.size();
        long end = (System.nanoTime() - start);
        System.out.println(decoratedList.getClass().getSimpleName() + " Executing method Size() spent: " + end + " nanoseconds");
        return rs;
    }

}
