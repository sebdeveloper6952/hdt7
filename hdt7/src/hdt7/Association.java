package hdt7;

/**
 * Sebastian Arriola 11463
 * Fernando Figueroa 14175
 * Jose Andres Arenas 14470
 */
public class Association<K extends Comparable<K>,V> implements
        Comparable<Association<K,V>>
{
    protected K key;
    protected V value;
    
    
    /**
     * se crea el constructor de la clase Association
     * @param k
     * @param v 
     */
    public Association(K k, V v)
    {
        key = k;
        value = v;
    }
    
    public K getKey() { return key; }
    public void setKey(K k) { key = k; }
    public V getValue() { return value; }
    public void setValue(V v) { value = v; }

    @Override
    public int compareTo(Association<K, V> o) 
    {
        return key.compareTo(o.getKey());
    }
}
