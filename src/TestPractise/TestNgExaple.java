package TestPractise;

import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by arvin on 2018/6/2.
 */
public class TestNgExaple {
    @Parameters({"before-do"})
    @BeforeClass
    public void beforeClass(String beforedo){
        System.out.println("this is :"+beforedo );
    }
    @Parameters({"test-name"})
    @Test(groups = {"checklist","function"})
    public void Test1(String testname ){
        System.out.println("this is Test:"+testname);
        assert "TransforCase1".equalsIgnoreCase(testname);
    }
    @Test(groups = "checklist")
    public void Test2(){
        System.out.println("this is Test case2");
    }
    @Test(groups = "function")
    public void Test3(){
        System.out.println("this is Test case3");
    }
    @Test(groups = {"checklist"})
    public void Test4(){
        System.out.println("this is Test case4");
    }
    @Test(groups = "function1")
    public void Test5(){
        System.out.println("this is Test case5");
    }
    @Test(groups = {"checklist","function"})
    public void Test6(){
        System.out.println("this is Test case6");
    }
    @Test(groups = {"window.function"})
    public void Test7(){
        System.out.println("this is Test case7");
    }
    @Test(groups = {"Linux.funciont"})
    public void Test8(){
        System.out.println("this is Test case8");
    }
    @Test(groups = "broken")
    public void Test9(){
        System.out.println("this is Test Broken");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("this is afterclass methord");
    }
}
