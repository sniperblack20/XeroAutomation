package login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.CommonUtilities;

public class XeroLogin {

	public WebDriver webDriver;
	public String userEmail;
	public String userPass;
	
	public void loginToXero() throws IOException {
		
		CommonUtilities comutils = new CommonUtilities();
		
		userEmail = comutils.getTokensFromPropertiesFile("email");
		userPass = comutils.getTokensFromPropertiesFile("pass");
		
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.get("https://login.xero.com/");
		
		// enter email
		WebElement emailField = webDriver.findElement(By.id("email"));
		emailField.sendKeys(userEmail);
		
		// enter password
		WebElement passField = webDriver.findElement(By.id("password"));
		passField.sendKeys(userPass);
        
		// click login
		WebElement xeroLoginButton = webDriver.findElement(By.id("submitButton"));
		xeroLoginButton.click();
		
	}
	
	public void CloseBrowser() {
		webDriver.quit();
	}
	
}
