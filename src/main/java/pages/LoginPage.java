package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driver;
	@FindBy(xpath="//*[@id='userid']")
	private WebElement userid;
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement password;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id='pin']")
	private WebElement pin;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginToApp()
	{
		userid.sendKeys("DV1510");
		password.sendKeys("Reset@123");
		loginbtn.click();
	}
public void Enterpin() {
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	pin.sendKeys("949495");
	loginbtn.click();
}



}
