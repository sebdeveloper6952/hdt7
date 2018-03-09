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
        
    }
    
    public BinaryTree(E value, IBinaryTree<E> left, IBinaryTree<E> right)
    {
        
    }
    
    @Override
    public IBinaryTree<E> left() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IBinaryTree<E> right() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IBinaryTree<E> parent() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLeft(IBinaryTree<E> newLeft) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRight(IBinaryTree<E> newRight) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<E> iterator() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLeftChild() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRightChild() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E value() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValue(E newValue) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setParent(IBinaryTree<E> newParent) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
