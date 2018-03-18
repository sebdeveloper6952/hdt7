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
    }
    
    
    protected BinaryTree steFindnode(BinaryTree<E> node,E value)
    {
        if(root.isEmpty()) return node;
        else
        {
               int steC =  node.value().compareTo(value);
               if (steC == 0 )return node;
               else if (steC > 0)
               {
                   return steFindnode(node.left(), value);
               }
               else 
               {
                  return steFindnode(node.right(), value); 
               }
        }
    }    
    
    
    
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
        BinaryTree<E> newNode = new BinaryTree<>(value);
        if (root.isEmpty())
        {
            root = newNode;
        }
        else
        {
          BinaryTree foundNode = steFindnode(root, value);
          foundNode.setValue(value);
          if (foundNode.left()== null)
              foundNode.setLeft(new BinaryTree());
          if (foundNode.right()== null)
              foundNode.setRight(new BinaryTree());
          
          
        }
            size++;       
            
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
