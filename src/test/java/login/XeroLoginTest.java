package login;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;


public class XeroLoginTest {
	XeroLogin xl = new XeroLogin();
	
	@Before
	public void StartBrowser_NavURL() throws URISyntaxException {
		setProperties();
	 }
	
	@After
	public void CloseBrowser() {	
		xl.CloseBrowser();
	}
	
	@Test
	public void landingPageHasAccountingTabTest() throws IOException {
		xl.loginToXero();
		WebElement accountingTab = xl.webDriver.findElement(By.name("navigation-menu/accounting"));
		assertEquals("Accounting", accountingTab.getText());
		
	}
	
	// ========================================== Other tests ==========================================
//	@Test
//	public void xeroPageHasLoginButtonTest() {
//		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		webDriver.get("https://login.xero.com/");
//		WebElement xeroLoginButton = webDriver.findElement(By.id("submitButton"));
//		assertEquals("Log in", xeroLoginButton.getText());
//	}
	// ========================================== Other tests ==========================================
	
	// ====================================== some other methods =======================================
	public void setProperties() throws URISyntaxException {
        URL chromeURL = getClass().getClassLoader().getResource("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", Paths.get(chromeURL.toURI()).toFile().getAbsolutePath());
 
    }
	
}
