package TestPractise;

import org.testng.annotations.DataProvider;

import javax.management.ObjectName;

/**
 * Created by arvin on 2018/6/2.
 */
public  class TestNgExaple3 {
    @DataProvider(name = "test2")
    public  static Object[][] createData(){
        return new Object[][]{
                new Object[]{new Integer(19)}
        };
    }
}
