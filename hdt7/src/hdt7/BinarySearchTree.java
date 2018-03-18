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
public class BinarySearchTree<E extends Comparable<E>>
{
    
    // referencia a la raiz de nuestro arbol binario
    protected BinaryTree root;
    int size;
    
    public BinarySearchTree()
    {
        root = new BinaryTree<>();
        size = 0;    

    public boolean isEmpty() 
    {
        return root.isEmpty();
    }

    
    public void clear() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public int size() 
    {
       return size;
    }

    
    public void add(E value) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public boolean contains(E value) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public E get(E value) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public E remove(E value) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
