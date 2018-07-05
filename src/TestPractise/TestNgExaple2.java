package TestPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by arvin on 2018/6/2.
 */
public class TestNgExaple2 {
    @DataProvider(name = "test1")
    public Object [][] CreateData(){
        return new Object[][]{
                {"amy",new Integer(30)},
                {"Anne",new Integer(37)}
        };
    }

    @Test(dataProvider = "test1",threadPoolSize = 2,invocationCount = 10,timeOut = 10000)
    public void ReceiverData(String n1,Integer n2){
       System.out.println(n1+n2);
    }

}

