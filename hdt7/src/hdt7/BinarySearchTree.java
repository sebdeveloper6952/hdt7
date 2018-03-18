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
    
    public BinarySearchTree(){
        _tree = new BinaryTree<>();
        size = 0;
        
        
        
        
    }
    
    // referencia a la raiz de nuestro arbol binario
    protected BinaryTree _tree;
    int size;

    
    public boolean isEmpty() 
    {
        return _tree.isEmpty();
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
