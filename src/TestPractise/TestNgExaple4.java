package TestPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by arvin on 2018/6/3.
 */
public class TestNgExaple4 {
    @DataProvider(name = "a_data")
    public Object[][] ServerStartOK(){
        int i = 10;
        int j = 15;
        int a = i + j;
        return new Object[][]{
                new Object[a]
        };
    }
    @Test(alwaysRun = true)
    public int Methord1(){
        int a= 12;
        int b = 20;
        int c = a + b ;
        System.out.println(c);
        return c;
    }
    @Test(dataProvider = "a_data",dependsOnMethods = {"Methord1"})
    public boolean Methord(int d ){
        int b = Methord1();
        System.out.println(d);
        if (b > 10){
            System.out.println(b+"is ok");
            return true;
        }
        else {
            System.out.println(b+"is not ok");
            return false;
        }
    }
}
