/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 * Sebastian Arriola 11463
 * Fernando Figueroa 14175
 * Jose Andres Arenas 14470
 */
public class Association<K,V>
{
    protected K key;
    protected V value;
    
    public Association(K k, V v)
    {
        key = k;
        value = v;
    }
    
    public K getKey() { return key; }
    public void setKey(K k) { key = k; }
    public V getValue() { return value; }
    public void setValue(V v) { value = v; }
}
