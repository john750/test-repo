package project1.artifact1;

import org.testng.annotations.BeforeSuite;
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

    private AppTest()
    {
    }
    
    @Test
    public void my_test1() {
    	Assert.assertTrue( true );
    }
    
    @BeforeSuite
    public void preparation_1() {
    	System.out.println("preparation_1");
    }
}
