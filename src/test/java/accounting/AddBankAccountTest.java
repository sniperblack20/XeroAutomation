package accounting;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddBankAccountTest {
	
	AddBankAccount aba = new AddBankAccount();
	
	@Test
	public void addBankAccountTest() throws IOException {
		
		String accountNumber = aba.accountNumberGenerator();
		String accountName = aba.accountNameGenerator();
		
		aba.loginToXero();
		aba.addBankAccount(accountNumber, accountName);
		
		// verify if account number is present in dashboard
		List<WebElement> actNumber = aba.webDriver.findElements(By.partialLinkText(accountName));
		assertTrue(actNumber.size() != 0);
	}
	
	@After
	public void CloseBrowser() {	
		aba.CloseBrowser();
	}
	
}
