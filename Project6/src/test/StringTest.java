package test;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Class: CMSC201
 * Instructor:Grigoriy Grinberg
 * Description: Test String methods using JUnit
 * Due:05/10/2026
 * pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
Print your Name here: Hawi Tolessa
 */
public class StringTest {

    /** Test length() method */
    @Test
    public void testLength() {
        String str = "Hello";
        assertEquals(5, str.length());
    }

    /** Test charAt() method */
    @Test
    public void testCharAt() {
        String str = "Hello";
        assertEquals('H', str.charAt(0));
        assertEquals('o', str.charAt(4));
    }

    /** Test substring() method */
    @Test
    public void testSubstring() {
        String str = "Hello";
        assertEquals("ell", str.substring(1, 4));
        assertEquals("Hello", str.substring(0));
    }

    /** Test indexOf() method */
    @Test
    public void testIndexOf() {
        String str = "Hello";
        assertEquals(2, str.indexOf('l'));
        assertEquals(-1, str.indexOf('z')); // not found
    }
}