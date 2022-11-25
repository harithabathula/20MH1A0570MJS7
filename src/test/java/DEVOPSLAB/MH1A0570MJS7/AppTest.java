package DEVOPSLAB.MH1A0570MJS7;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
    public void test() {

        App p = new App();
        assertEquals("Hello DURGA", p.getMessage("DURGA"));

    }
}
