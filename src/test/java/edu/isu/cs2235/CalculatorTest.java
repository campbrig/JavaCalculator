
package edu.isu.cs2235;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator fixture;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fixture = new Calculator;
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        int first = 5;
        int second = 6;

        double result = Calculator.add(first, second);
        AssertEquals

    }

    @Test
    public void testSubtract() {
    }

    @Test
    public void testDivide() {
    }

    @Test
    public void testMultiply() {
    }

    @Test
    public void testHistory() {
    }

}
