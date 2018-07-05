package TestPractise;
import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * Created by arvin on 2018/6/10.
 */
public class SeleniumPractise {
    public static final String drivertype="webdriver.chrome.driver";
    public static final String driverpath = "/Users/arvin/Documents/autotest/selenuim/ChromeDrive/chromedriver";

    @BeforeTest
    public void SetProperties(){

    }

    public WebElement GetUrlandOpen(String url,String input_id){
        System.setProperty(drivertype, driverpath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement element = driver.findElement(By.id(input_id));
        return element;

    }

    @Test(description="打开1药网的网址")
    public void OpenBaidu(){
        String input_id ="logininfo";
        String url="http://www.111.com.cn/";
        System.setProperty(drivertype, driverpath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement element = driver.findElement(By.id(input_id));
        element.click();
		driver.quit();
    }
    @Test(description = "打开百度的地址")
   public void SearchFmilay(){
        String input_id="家人";
        String id="kw";
        String url = "https://www.baidu.com/";
       System.setProperty(drivertype, driverpath);
       WebDriver driver = new ChromeDriver();
       driver.get(url);
       WebElement element = driver.findElement(By.id(id));
       element.click();
       element.sendKeys(new String[]{input_id});
       element.submit();
       //driver.quit();

   }
}
