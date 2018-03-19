package hdt7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Sebastian Arriola 11463
 * Fernando Figueroa 14175
 * Jose Andres Arenas 14470
 */
public class BinarySearchTree<E extends Comparable<E>>
{
    
    // referencia a la raiz de nuestro arbol binario
    protected BinaryTree<E> root;
    int size;
    
    public BinarySearchTree()
    {
        root = new BinaryTree<>();
        size = 0;
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

    /**
     * Agrega al arbol el valor deseado.
     * @param value Valor que se desea agregar.
     */
    public void add(E value) 
    {
        BinaryTree<E> newNode = new BinaryTree<>(value);
        if (root.isEmpty())
        {
            root = newNode;
        }
        else
        {
          BinaryTree<E> foundNode = steFindNode(root, value);
          foundNode.setValue(value);
          if (foundNode.left()== null)
              foundNode.setLeft(new BinaryTree<E>());
          if (foundNode.right()== null)
              foundNode.setRight(new BinaryTree<E>());
        }
        size++;       
    }

    /**
     * 
     * @param key El valor que se desea buscar en el arbol.
     * @return True si el valor esta en el arbol, falso de lo contrario.
     */
    public boolean contains(E key)
    {
        return get(key) == key;
    }

    /**
     * 
     * @param key El valor que se desea buscar en el arbol.
     * @return El valor para asociado a la llave solicitada.
     */
    public E get(E key) 
    {
        if(root.isEmpty()) return null;
        BinaryTree<E> node = steFindNode(root, key);
        if(node.isEmpty()) return null;
        return node.value();
    }

    /**
     * lolito
     * @param value
     * @return 
     */
    public E remove(E value) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Recorre el arbol en orden y devuelve los nodos en una lista.
     * @return Los nodos en una lista.
     */
    public List<E> enOrden()
    {
        List<E> list = new ArrayList<>();
        enOrden(root, list);
        return list;
    }
    
    /**
     * Metodo recursivo para encontrar el nodo donde esta o deberia estar
     * ubicada la llave pasada como parametro.
     * @param node El nodo que se considera como raiz actual.
     * @param key La llave que se desea saber si esta en el arbol.
     * @return 
     */
    protected BinaryTree steFindNode(BinaryTree<E> node,E key)
    {
        if(node.isEmpty()) return node;
        else
        {
           int steC =  node.value().compareTo(key);
           if (steC == 0 )return node;
           else if (steC > 0)
           {
               return steFindNode(node.left(), key);
           }
           else 
           {
              return steFindNode(node.right(), key); 
           }
        }
    }    
    
    /**
     * Metodo recursivo para recorrer el nodo deseado en orden.
     * @param node Nodo que se desea recorrer en orden.
     * @param list Lista para guardar los nodos en orden.
     */
    protected void enOrden(BinaryTree<E> node, List<E> list)
    {
        if(node.left() != null && !node.left().isEmpty()) enOrden(node.left(), list);
        list.add(node.value());
        if(node.right() != null && !node.right().isEmpty()) enOrden(node.right(), list);
    }
}
