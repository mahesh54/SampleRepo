import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SamplesTest {
	
	@Test()
	public void sampleTest() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://tools.com");
		Thread.sleep(5000);
	List<WebElement>	urls=driver.findElements(By.cssSelector("p.url"));
	for (WebElement webElement : urls) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@Return value:"+isLinkClickable(webElement));
	}
	}
	public boolean isLinkClickable(WebElement element){
	       try {
	          element .click(); 
	          return true;
	        } catch(Exception e){
	          return false;
	       }
	}
	
	@Test(dataProvider="testData")
	public void sampleTest1(String str,String str2){
		System.out.println("String:"+str+",String 2:"+str2);
	}
	@Test(dataProvider="testData")
	public void sampleTest1(String str){
		System.out.println("String:"+str);
	}
	
	@DataProvider(name="testData")
	public Object[][] dataProviderEx(){
		return   new Object[][]{{"1"},{"2"}};
	}
}
