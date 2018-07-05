package TestPractise;

import org.testng.annotations.Test;

/**
 * Created by arvin on 2018/6/3.
 * 用于多组的测试数据进行测试，测试的数据来自于TestWebServer；
 */
public class TestWebServer {
    @Test(parameters = {"number-of-times"})
    public void accesspage(int numberOfTimes){
      while (numberOfTimes -- > 0){
         System.out.println(numberOfTimes);
      }
    }
}
