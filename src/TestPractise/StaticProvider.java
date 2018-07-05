package TestPractise;

import org.testng.annotations.DataProvider;

/**
 * Created by arvin on 2018/6/2.
 */
public class StaticProvider {
    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][] {
                new Object[] { new Integer(42) }
        };
    }
}
