package TestPractise;

import org.testng.annotations.Test;
/**
 * Created by arvin on 2018/6/3.
 */
public class WebTest {
    public int m_numberOfTimes;
    public  WebTest(int numberOfTimes){
        m_numberOfTimes = numberOfTimes;
    }
    public WebTest() {
        System.out.println("Good for You");
    }
    @Test
    public void testServer(){
        for (int i = 0 ;i < m_numberOfTimes;i++){
            System.out.println(i);
        }
   }

}
