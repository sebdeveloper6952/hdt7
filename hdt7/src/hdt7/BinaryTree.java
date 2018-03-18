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
public class BinaryTree<E>
{
    protected E value;
    protected BinaryTree<E> parent, left, right;
    
    public BinaryTree()
    {
        value = null;
        parent = left = right = null;
    }
    
    public BinaryTree(E value)
    {
        this.value = value;
        setLeft(new BinaryTree<>());
        setRight(new BinaryTree<>());
    }
    
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
    {
        this(value);
        if(left != null) setLeft(left); 
        if(right != null) setRight(right);
    }
    
    public BinaryTree<E> left() { return left; }
    public BinaryTree<E> right() { return right; }
    public BinaryTree<E> parent() { return parent; }

    public void setLeft(BinaryTree<E> newLeft) 
    { 
        newLeft.setParent(this);
    }

    public void setRight(BinaryTree<E> newRight)
    { 
        newRight.setParent(this);
    }
    
    public Iterator<E> iterator() 
    {
        // lolito
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean isLeftChild()
    {
        if(parent != null)
        {
            BinaryTree left = parent.left();
            return this == left;
        }
        return false;
    }
    
    public boolean isRightChild() 
    {
        if(parent != null)
        {
            BinaryTree right = parent.right();
            return this == right;
        }
        return false;
    }

    public E value() { return value; }
    
    public void setValue(E newValue) { value = newValue; }
    
    protected void setParent(BinaryTree<E> newParent) 
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
