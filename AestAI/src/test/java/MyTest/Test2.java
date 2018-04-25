package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	 public WebDriver driver;
	@Test
	public void login()
	{
		System.out.println("My Test3");
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\backup\\Selenium\\JarFiles\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.softwaretestingmaterial.com/");
	}

}
