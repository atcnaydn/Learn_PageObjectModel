package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_FIELD;
	
	
	public void verifyDashboardPage() {
		
		Assert.assertEquals(DASHBOARD_HEADER_FIELD.getText(), "Dashboard", "Wrong Page");
		
	}
	
}
