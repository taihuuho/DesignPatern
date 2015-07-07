/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author 984571
 * @param <E>
 */
public abstract class AbstractListProfileDecorator<E> implements List<E> {

    protected List<E> decoratedList;

    public AbstractListProfileDecorator(List<E> decoratedList) {
        this.decoratedList = decoratedList;
    }
    
    @Override
    public abstract boolean remove(Object o);

    @Override
    public abstract boolean add(E e);

    @Override
    public abstract boolean contains(Object o);

    @Override
    public abstract int size();

    @Override
    public boolean isEmpty() {
         return decoratedList.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
         return decoratedList.iterator();
    }

    @Override
    public Object[] toArray() {
         return decoratedList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
         return decoratedList.toArray(a);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
         return decoratedList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
         return decoratedList.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
         return decoratedList.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
         return decoratedList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
         return decoratedList.removeAll(c);
    }

    @Override
    public void clear() {
         decoratedList.clear();
    }

    @Override
    public E get(int index) {
         return decoratedList.get(index);
    }

    @Override
    public E set(int index, E element) {
         return decoratedList.set(index, element);
    }

    @Override
    public void add(int index, E element) {
         decoratedList.add(index, element);
    }

    @Override
    public E remove(int index) {
         return decoratedList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
         return decoratedList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
         return decoratedList.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
         return decoratedList.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
         return decoratedList.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
         return decoratedList.subList(fromIndex, toIndex);
    }

}
