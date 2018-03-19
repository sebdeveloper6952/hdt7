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
    
    /**
 * Se crean los constructores de la clase Binarytree 
 * @author Fernando Figueroa
 * @param <E> 
 */
    
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

    
    /**
     * se especifica cual es el valor del
     * nuevo hijo izquierdo
     * @param newLeft 
     */
    public void setLeft(BinaryTree<E> newLeft) 
    {
        left = newLeft;
        newLeft.setParent(this);
    }

    /**
     * se especifica cual es el valor del
     * nuevo hijo derecho
     * @param newRight 
     */
    public void setRight(BinaryTree<E> newRight)
    {
        right = newRight;
        newRight.setParent(this);
    }
    
    /**
     * revisa si un hijo es un hijo izquierdo, de ser asi nos regresa un true
     * de lo contrario regresa un false 
     * @return 
     */
    public boolean isLeftChild()
    {
        if(parent != null)
        {
            BinaryTree left = parent.left();
            return this == left;
        }
        return false;
    }
    
    
    /**
     * revisa si un hijo es un hijo derecho, de ser asi nos regresa un true
     * de lo contrario regresa un false 
     * @return 
     */
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
        parent = newParent;
    }
    
    /**
     * 
     *nos regresa el valor null si el nodo esta vacio
     */
    protected boolean isEmpty()
    {
        return value == null;
    }
}
