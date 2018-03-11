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
public interface IBinaryTree<E>
{
    public IBinaryTree<E> left();
    public IBinaryTree<E> right();
    public IBinaryTree<E> parent();
    public void setLeft(IBinaryTree<E> newLeft);
    public void setRight(IBinaryTree<E> newRight);
    public Iterator<E> iterator();
    public boolean isLeftChild();
    public boolean isRightChild();
    public E value();
    public void setValue(E newValue);
}
