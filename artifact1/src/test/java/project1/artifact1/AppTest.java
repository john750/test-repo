package project1.artifact1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest{
	ApplicationContext context;
	
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
    
    @BeforeTest
    public void init() {
    	context = new ClassPathXmlApplicationContext("spring_beans.xml");
    }
    
    @Test
    public void test_20() {
    	App AppObject=(App) context.getBean("appObject");
    	Assert.assertEquals(AppObject.ComponentAObject.my_int2, (Integer) 20);
    	Assert.assertEquals(AppObject.ComponentBObject.my_int2, (Integer) 2);
    }
}
