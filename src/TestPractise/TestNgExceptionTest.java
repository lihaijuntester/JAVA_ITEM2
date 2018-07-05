package TestPractise;

import org.testng.annotations.Test;

/**
 * Created by arvin on 2018/6/2.
 * 异常测试的注解
 */
public class TestNgExceptionTest {
    @Test(expectedExceptions = IllegalArgumentException.class,expectedExceptionsMessageRegExp = "NullPoint")
    public void TestExcepton(){
        throw new IllegalArgumentException("NullPoint");
    }
}
