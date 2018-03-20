package hdt7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Sebastian Arriola 11463
 * Fernando Figueroa 14175
 * Jose Andres Arenas 14470
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
