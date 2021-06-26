package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
 public static WebDriver driver;
 LoginPage lp;
 
 @BeforeSuite
 public void openbrowser(){
	 WebDriverManager.chromedriver().setup();
 ChromeOptions options = new ChromeOptions();
 
 
 options.addArguments("--disable-notifications");

//	options.addArguments("--headless");// to execute without opening the browser

	options.addArguments("--start-maximized");// to start the browser in maximized mode


	driver = new ChromeDriver(options);

	// To launch the browser
//	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");



}



@BeforeClass
public void createObject()
{
	 lp = new LoginPage(driver);
}



//@AfterSuite
//public void quitBrowser()
//{
//	driver.quit();
//}




}
