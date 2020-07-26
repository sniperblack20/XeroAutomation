package accounting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.XeroLogin;

public class AddBankAccount extends XeroLogin {

	public void addBankAccount(String accountNumber, String accountName) {
		// click accounting
		WebElement accountingTab = webDriver.findElement(By.name("navigation-menu/accounting"));
		accountingTab.click();
		
		// click bank account
		WebElement bankAccounts = webDriver.findElement(By.linkText("Bank accounts"));
		bankAccounts.click();
		
		// click add bank account
		WebElement addBankAccounts = webDriver.findElement(By.linkText("Add Bank Account"));
		addBankAccounts.click();
		
		// enter ANZ (NZ)
		WebElement yourBankField = webDriver.findElement(By.name("xui-searchfield-1018-inputEl"));
		yourBankField.sendKeys("ANZ (NZ)");
		
		// select ANZ
		WebElement anzBank = webDriver.findElement(By.cssSelector("#dataview-1025 > li"));
		anzBank.click();
		
		// supply the name 
		WebElement accountNameField = webDriver.findElement(By.name("accountname-1037-inputEl"));
		accountNameField.sendKeys(accountName);
		
		WebElement accountTypeField = webDriver.findElement(By.name("accounttype-1039-inputEl"));
		accountTypeField.click();
		
		// click everyday
		WebElement accountTypeOptionEveryDay = webDriver.findElement(By.cssSelector("#boundlist-1076-listEl > li:nth-child(1)"));
		accountTypeOptionEveryDay.click();
		
		// supply the account number
		WebElement accountNumberField = webDriver.findElement(By.name("accountnumber-1068-inputEl"));
		accountNumberField.sendKeys(accountNumber);
		
		// click continue
		WebElement continueButton = webDriver.findElement(By.id("common-button-submit-1015-btnInnerEl"));
		continueButton.click();
		
		// click I've got a form
		WebElement iHaveFormButton = webDriver.findElement(By.linkText("I've got a form"));
		iHaveFormButton.click();
		
		// click I'll do it later
		WebElement illDoItLater = webDriver.findElement(By.linkText("I'll do it later"));
		illDoItLater.click();
		
		// click go to Dashboard
		WebElement dashboard = webDriver.findElement(By.linkText("Go to dashboard"));
		dashboard.click();
		
	}
	
	public String accountNumberGenerator() {
		//Create formatter
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss"); 
		//Local date time instance
		LocalDateTime localDateTime = LocalDateTime.now();
		 
		//Get formatted String
		String accountNumber = myFormat.format(localDateTime);
		 
		//System.out.println(ldtString);  
		return accountNumber;
	}
	
	public String accountNameGenerator() {
		//Create formatter
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss"); 
		//Local date time instance
		LocalDateTime localDateTime = LocalDateTime.now();
		 
		//Get formatted String
		String accountName = "Horus" + myFormat.format(localDateTime);
		 
		//System.out.println(ldtString);  
		return accountName;
	}
}
