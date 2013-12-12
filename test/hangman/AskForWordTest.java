/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessicahildenbrand
 */
public class AskForWordTest {
    
    public AskForWordTest() {
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
     * Test of displayBlankSpaces method, of class AskForWord.
     */
    @Test
    public void testDisplayBlankSpaces() {
        System.out.println("displayBlankSpaces");
        AskForWord instance = new AskForWord();
        instance.displayBlankSpaces();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpaces method, of class AskForWord.
     */
    @Test
    public void testGetSpaces() {
        System.out.println("getSpaces");
        AskForWord instance = new AskForWord();
        instance.getSpaces();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySpaces method, of class AskForWord.
     */
    @Test
    public void testDisplaySpaces() {
        System.out.println("displaySpaces");
        String numberOfLetters = "";
        String numberOfSpaces = "";
        AskForWord instance = new AskForWord();
        instance.displaySpaces(numberOfLetters, numberOfSpaces);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWord method, of class AskForWord.
     */
    @Test
    public void testGetWord() {
        System.out.println("getWord");
        AskForWord instance = new AskForWord();
        String expResult = "";
        String result = instance.getWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkWord method, of class AskForWord.
     */
    @Test
    public void testCheckWord() {
        System.out.println("checkWord");
        AskForWord instance = new AskForWord();
        instance.checkWord();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}