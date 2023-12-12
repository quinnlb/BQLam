/*
 * Class: CMSC201 
 * Instructor:
 * Description: Using JUnit
 * Due: 12/11/23
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Bao Quyen Lam_________
*/


import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit test class for testing methods of the java.lang.String class.
 */
public class StringTest {
    private String testString;

    /**
     * Sets up the test by initializing the test string.
     *
     * @throws Exception If an exception occurs during setup.
     */
    @Before
    public void setUp() throws Exception {
        testString = "Hello, Bao";
    }

    /**
     * Test the length method of the String class.
     */
    @Test
    public void testStringLength() {
        assertEquals(10, testString.length());
    }

    /**
     * Test the charAt method of the String class.
     */
    @Test
    public void testCharAt() {
        assertEquals('H', testString.charAt(0));
        assertEquals('B', testString.charAt(7));
    }

    /**
     * Test the substring method of the String class.
     */
    @Test
    public void testSubstring() {
        assertEquals("Hello", testString.substring(0, 5));
        assertEquals("Bao", testString.substring(7));
    }

    /**
     * Test the indexOf method of the String class.
     */
    @Test
    public void testIndexOf() {
        assertEquals(7, testString.indexOf("Bao"));
        assertEquals(-1, testString.indexOf("Java"));
    }
}
