/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.util.Iterator;

/**
 * Sebastian Arriola 11463
 * Fernando Figueroa 14175
 * Jose Andres Arenas 14470
 */
public interface IBinarySearchTree<E extends Comparable>
{
    public boolean isEmpty();
    public void clear();
    public int size();
    public void add(E value);
    public boolean contains(E value);
    public E get(E value);
    public E remove(E value);
    public Iterator<E> iterator();
}
