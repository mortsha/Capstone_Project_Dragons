package tek.capstone.dragons.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage  extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(id="search")
	public WebElement allDepartmentBttn;
	
	@FindBy(xpath ="//input[@id='searchInput']")
	public WebElement searchBarOption;
	
	@FindBy(id="searchBtn")
	public WebElement searchBttn;
	@FindBy(xpath="//div//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorItem;
	@FindBy(xpath ="//select[@class='product__select']")
	public WebElement quantityOption;
	@FindBy(xpath="//button//span[text()='Add to Cart']")
	public WebElement addToCardBttn;
	@FindBy(xpath="//div//span[@id='cartQuantity']")
	public WebElement cartQuantity;
	@FindBy(className = "cart__item-product-name")
	public List<WebElement> cartQuantityList;
	@FindBy(xpath ="//input[@class='cart__item-quantity']")
	public WebElement quantityField;
	
	@FindBy(xpath = "//p//span[text()='Delete']")
	public WebElement deleteBttn;
	
	//span[@id='cartQuantity']
	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement cartOption;
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement proceedToChechoutBttn;
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement placeYourOrderBttn;
	@FindBy(xpath = "//div//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedText;
	@FindBy(xpath = "//div//span[text()='Delete']")
	public WebElement deleteBttnInCard;
	
	@FindBy(xpath ="//div//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexItem;
	
	// cancel order part
	@FindBy(id="orderLink")
	public WebElement ordersOption;
	
	@FindBy(xpath = "//div//button[text()='Cancel The Order']")
	public WebElement cancelTheOrderBttn;
	@FindBy(id="reasonInput")
	public WebElement cancelDropdown;
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderInOrderSection;
	@FindBy(xpath = "//div//p[text()='Your Order Has Been Cancelled']")
	public WebElement OrderCancelMessage;
	
	
	//  return order 
	@FindBy(id = "returnBtn")
	public WebElement returnItemBttn;
	@FindBy(id="reasonInput")
	public WebElement returnDropdown;
	@FindBy(id="dropOffInput")
	public WebElement returnWhereDropdown;
	@FindBy(id="orderSubmitBtn")
	public WebElement returnBttnInOrder;
	@FindBy(xpath = "//div//p[text()='Return was successfull']")
	public WebElement reutrnSuccessfullMessage;
	
	// write a review part
	
	
	@FindBy(xpath = "//div//button[text()='Review']")
	public WebElement reviewBttn;
	@FindBy(id="headlineInput")
	public WebElement headlineInput;
	@FindBy(id="descriptionInput")
	public WebElement reviewTextInput;
	@FindBy(id="reviewSubmitBtn")
	public WebElement addYourReviewBttn;
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedMessage;
	
}