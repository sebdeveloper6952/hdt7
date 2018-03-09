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
public class BinaryTree<E> implements IBinaryTree<E>
{
    protected E value;
    protected IBinaryTree<E> parent, left, right;
    
    public BinaryTree()
    {
        
    }
    
    public BinaryTree(E value)
    {
        this.value = value;
    }
    
    public BinaryTree(E value, IBinaryTree<E> left, IBinaryTree<E> right)
    {
        this(value);
        this.left = left;
        this.right = right;
    }
    
    @Override
    public IBinaryTree<E> left() { return left; }

    @Override
    public IBinaryTree<E> right() { return right; }

    @Override
    public IBinaryTree<E> parent() { return parent; }

    @Override
    public void setLeft(IBinaryTree<E> newLeft) { left = newLeft; }

    @Override
    public void setRight(IBinaryTree<E> newRight) { right = newRight; }

    @Override
    public Iterator<E> iterator() 
    {
        // lolito
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLeftChild() 
    {
        if(parent != null)
        {
            IBinaryTree left = parent.left();
            return this == left;
        }
        return false;
    }

    @Override
    public boolean isRightChild() 
    {
        if(parent != null)
        {
            IBinaryTree right = parent.right();
            return this == right;
        }
        return false;
    }

    @Override
    public E value() { return value; }

    @Override
    public void setValue(E newValue) { value = newValue; }
    
    protected void setParent(IBinaryTree<E> newParent) 
    {
        if(!isEmpty())
        {
            parent = newParent;
        }
    }
    
    protected boolean isEmpty()
    {
        return value == null;
    }
}
