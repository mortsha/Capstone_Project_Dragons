package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	@FindBy(id = "signinLink")
	public WebElement signinBttn;
	
	// signin steps
	@FindBy(id="email")
	public WebElement emailInputField;
	@FindBy(id="password")
	public WebElement passwordInputField;
	@FindBy(id="loginBtn")
	public WebElement loginBttn;
	@FindBy(id="accountLink")
	public WebElement accountBttn;
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement yourProfileText;
	@FindBy(id="orderLink")
	public WebElement orderLinkOption;
	@FindBy(id="logoutBtn")
	public WebElement logoutOption;
	
	// signup steps
	@FindBy(id="newAccountBtn")
	public WebElement createNewAccountBttn;
	@FindBy(id="nameInput")
	public WebElement nameInputFieldRegister;
	@FindBy(id="emailInput")
	public WebElement emailInputFieldRegister;
	@FindBy(id="passwordInput")
	public WebElement passInputFieldRegister;
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassInputFieldRegister;
	@FindBy(id="signupBtn")
	public WebElement signupBttn;
	
	
}
