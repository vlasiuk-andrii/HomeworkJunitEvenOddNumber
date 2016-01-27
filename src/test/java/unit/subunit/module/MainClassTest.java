package unit.subunit.module;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainClassTest {

    @BeforeClass

    public static void testSetup() {

    }

    @AfterClass

    public static void testCleanup() {

    }

    @Test
    public void testEven(){
        MainClass tester = new MainClass();
        assertEquals(true, tester.evenOdd(0));
    }

    @Test
    public void testOdd(){
        MainClass tester = new MainClass();
        assertEquals(false, tester.evenOdd(99));
    }

    @Test(expected = NumberFormatException.class)
    public void testException() {
        MainClass tester = new MainClass();
        tester.evenOdd("wef");
    }
}