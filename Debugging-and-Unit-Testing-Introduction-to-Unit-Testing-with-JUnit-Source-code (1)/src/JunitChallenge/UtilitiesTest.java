package JunitChallenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setUp(){
       util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        fail("This test has not been yet implomented");
    }

   @Test
    public void removePairs() {
   //Utilities util = new Utilities();
   assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void converter() {
        assertEquals(300,util.converter(10,5),.001);
    }

    @Test
    public void nullIfOddLength() {

        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}