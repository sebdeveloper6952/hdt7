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
    
    
    /**
     * se crea el constructor de la clase 
     */
    public BinarySearchTree()
    {
        root = new BinaryTree<>();
        size = 0;
    }
    
    /**
     * metodo que revisa si la raiz esta vacia.
     * @return 
     */
    public boolean isEmpty() 
    {
        return root.isEmpty();
    }

    
    public void clear() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * metodo que regresa el tamano del arbol
     * @return 
     */
    public int size() 
    {
       return size;
    }

    /**
     * metodo el cual agrega nodos al arbol tanto del lado derecho como 
     * del lado izquierdo
     * @param value 
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
          BinaryTree<E> foundNode = steFindnode(root, value);
          foundNode.setValue(value);
          if (foundNode.left()== null)
              foundNode.setLeft(new BinaryTree<E>());
          if (foundNode.right()== null)
              foundNode.setRight(new BinaryTree<E>());
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

    
    /**
     * Se crea un array que nos ayudara a poder desplegar las palabras 
     * en orden alfabetico
     * @return 
     */
    
    public List<E> enOrden()
    {
        List<E> list = new ArrayList<>();
        enOrden(root, list);
        return list;
    }
    
    
    /**
     * se crea un metodo el cual nos va a ayudar a encontrar en que lugar se 
     * puede agregar un nuevo nodo
     * @param node
     * @param value
     * @return 
     */
    protected BinaryTree steFindnode(BinaryTree<E> node,E value)
    {
        if(node.isEmpty()) return node;
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
    
    
    /** 
     * se crea un metodo el cual utiliza la lista "lista" el cual ordena de 
     * forma alfabetica las palabras que se quieren traducir 
     * @param node
     * @param list 
     */
    protected void enOrden(BinaryTree<E> node, List<E> list)
    {
        if(node.left() != null && !node.left().isEmpty()) enOrden(node.left(), list);
        list.add(node.value());
        if(node.right() != null && !node.right().isEmpty()) enOrden(node.right(), list);
    }
}
