package TestPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by arvin on 2018/6/3.
 */
public class CreateData {
    @DataProvider(name = "db")
    public Object[][] CreateData(Method m) {
        System.out.println(m.getName());
        return new Object[][]{new Object[]{"Credit"},
                new Object[]{"old"},
                new Object[]{"yeard"},
                new Object[]{"good"},
                new Object[]{"thanks"},
                new Object[]{"teacher"},
                new Object[]{"students"},
                new Object[]{"colleage"}
        };
    }
    @Test( dataProvider = "db")
    public void test1(String s){
        System.out.println("it is the first call methord "+s);
    }
    @Test(dataProvider = "db")
    public void test2(String s){
        System.out.println("it is the secode call methord "+s);
    }
    @Test( dataProvider = "db")
    public void test3(String s){
        System.out.println("it is the first call methord "+s);
    }
    @Test(dataProvider = "db")
    public void test4(String s){
        System.out.println("it is the secode call methord "+s);
    }
    @Test( dataProvider = "db")
    public void test5(String s){
        System.out.println("it is the first call methord "+s);
    }
    @Test(dataProvider = "db")
    public void test6(String s){
        System.out.println("it is the secode call methord "+s);
    }
    @Test( dataProvider = "db")
    public void test7(String s){
        System.out.println("it is the first call methord "+s);
    }
    @Test(dataProvider = "db")
    public void test8(String s){
        System.out.println("it is the secode call methord "+s);
    }
}
