package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	@FindBy(id="accountLink")
	public WebElement accountBttn;
	@FindBy(id="nameInput")
	public WebElement nameInputField;
	@FindBy(id="personalPhoneInput")
	public WebElement phoneInputField;
	@FindBy(id="personalUpdateBtn")
	public WebElement updateBttn;
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement infoUpdateText;
	
	//add payment part
	@FindBy(xpath = "//div//p[text()='Add a payment method']")
	public WebElement addPaymentLink;
	@FindBy(id="cardNumberInput")
	public WebElement cardNumber;
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCard;
	@FindBy(id= "expirationMonthInput")
	public WebElement expirationMonth;
	@FindBy(id="expirationYearInput")
	public WebElement expirationYear;
	@FindBy(id="securityCodeInput")
	public WebElement securityCode;
	@FindBy(id="paymentSubmitBtn")
	public WebElement addYourCardBttn;
	@FindBy(xpath="//div//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodMessage;
	
	// editPayment part
	
	@FindBy(xpath = "//div[@class='account__payments']/div/div")
	public List<WebElement> paymentCardList;
	
	@FindBy(xpath = "//div[@class='account__payments']//p[text()='Master Card']")
	public WebElement masterCard;
	@FindBy(xpath="//div[@class='account__payment']//button[text()='Edit']")
	public WebElement editCardPayment;
	@FindBy(id="paymentSubmitBtn")
	public WebElement updateYourCardBttn;
	@FindBy(xpath = "//div//div[text()='Payment Method updated Successfully']")
	public WebElement updateMethodPaymentMessage;
	
	// remove card option
	@FindBy(xpath = "//p[@class='account__payment__sub-text']")
	public List<WebElement> cardEnding;
	
	@FindBy(xpath = "//div[@class='false account__payment-item']")
	public WebElement selectCartOption;
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeCard;
	
	// add address
	@FindBy(xpath = "//div[@class='account__address-grid']//p[text()='Add Address']")
	public WebElement addAddressBttn;
	
	@FindBy(id="countryDropdown")
	public WebElement countryDropdown;
	@FindBy(id="fullNameInput")
	public WebElement fullNameAddressField;
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumberAddressField;
	@FindBy(id="streetInput")
	public WebElement streetAddressField;
	@FindBy(id="apartmentInput")
	public WebElement apartmentAddressField;
	@FindBy(id="cityInput")
	public WebElement cityAddressField;
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateDropdown;
	@FindBy(id="zipCodeInput")
	public WebElement zipCodeAddressField;
	@FindBy(id="addressBtn")
	public WebElement addYourAddressBttn;
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedMessage;
	
	// edit address
	@FindBy(xpath = "//div[@class='account__address-single']//button[text()='Edit']")
	public WebElement editAdressBttn;
	@FindBy(id="addressBtn")
	public WebElement updateYourAddressBttn;
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedMessage;
	
	// delete address step
	@FindBy(xpath = "//div//button[text()='Remove']")
	public WebElement removeAddressBttn;
	
	@FindBy(xpath = "//div[@class='account__address-grid']/div")
	public List<WebElement> paymentAddressList;
	
}
