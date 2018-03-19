/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Figueroa
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class BinarySearchTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BinarySearchTree<Association<String,String>> instance = new BinarySearchTree<>();
        instance.add(new Association("House", "Casa"));
        Association<String,String> a = instance.get(new Association<String,String>("House", null));
        assertEquals("Casa",a.getValue());
    }

   
    @Test
    public void testGet() {
        System.out.println("get");
        BinarySearchTree<Association<String,String>> instance = new BinarySearchTree<>();
        instance.add(new Association("House", "Casa"));
        Association<String,String> a = instance.get(new Association<String,String>("House", null));
        assertEquals("Casa",a.getValue());
    }
    
    
}
