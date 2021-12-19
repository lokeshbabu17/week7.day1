package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class LoginPage extends BaseHooks{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	
				//action+FieldName
	public LoginPage enterUsername() throws InterruptedException {
		//System.out.println(driver);//driver = null
		driver.findElement(By.id("username")).sendKeys("uName");
		//Thread.sleep(10000);
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("pWord");
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);

	}

}
