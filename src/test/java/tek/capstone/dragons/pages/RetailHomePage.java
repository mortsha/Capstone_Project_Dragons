package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		
		PageFactory.initElements(getDriver(), this);
		
		
	}

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement tekschoolLogo;
	
	@FindBy(xpath = "//button//span[text()='All']")
	public WebElement allSectionBttn;
	
	@FindBy(xpath = "//div//div//span[text()='Electronics']")
	public WebElement electronicLink;
	
	@FindBy(xpath = "//div//div//span[text()='Computers']")
	public WebElement computerLink;
	
	@FindBy(xpath = "//div//div//span[text()='Smart Home']")
	public WebElement smartHomeLink;
	
	@FindBy(xpath = "//div//div//span[text()='Sports']")
	public WebElement sportsLink;
	
	@FindBy(xpath = "//div//div//span[text()='Automative']")
	public WebElement automativeLink;
	
	// second part
	@FindBy(xpath = "//div[@class='sidebar_content-item']")
	public List<WebElement> departments;
}
