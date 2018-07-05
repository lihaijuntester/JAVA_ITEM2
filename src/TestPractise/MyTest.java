package TestPractise;

import org.testng.annotations.Test;
/**
 * Created by arvin on 2018/6/2.
 */
public class MyTest {
    @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
    public void test(Integer n) {
        //
    }
}
