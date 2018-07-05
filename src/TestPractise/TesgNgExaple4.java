package TestPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by arvin on 2018/6/2.
 */
public class TesgNgExaple4 {
    @Test(dataProvider = "test2",dataProviderClass = TestNgExaple3.class)
            public void GetDataReceiver(Integer n){
       System.out.println("This is :"+n);
    }

}
