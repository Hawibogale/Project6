package test;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Class: CMSC201
 * * Instructor:Grigoriy Grinberg
 * Description: Test isPrime method using JUnit
 * Due:05/10/2026
 * pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
Print your Name here: Hawi Tolessa
 * 
 */
public class PrimeNumberMethodTest {

    /** Test prime numbers */
    @Test
    public void testPrimeNumbers() {
        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(7));
        assertTrue(PrimeNumberMethod.isPrime(13));
    }

    /** Test non-prime numbers */
    @Test
    public void testNonPrimeNumbers() {
        assertFalse(PrimeNumberMethod.isPrime(1));
        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(9));
    }
}