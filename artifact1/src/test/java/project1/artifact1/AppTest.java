package project1.artifact1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    @Test
    @Parameters("my_int")
    public void my_test1(Integer my_int) {
    	Assert.assertEquals(my_int, (Integer) 10);
    }
   
}
