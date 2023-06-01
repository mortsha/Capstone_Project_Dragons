package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		click(factory.retailOrderPage().allDepartmentBttn);
		selectByVisibleText(factory.retailOrderPage().allDepartmentBttn, smartHome);
		logger.info("User changed the category " + smartHome + " successfully");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		click(factory.retailOrderPage().searchBarOption);
		sendText(factory.retailOrderPage().searchBarOption, item);
		logger.info("user entered " + item + " to search bar successfully");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrderPage().searchBttn);
		logger.info("User clicked on search icon successfully");
	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.retailOrderPage().kasaOutdoorItem);
		logger.info("User clicked on item successfully");
	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String quantity) {
		click(factory.retailOrderPage().quantityOption);
		selectByVisibleText(factory.retailOrderPage().quantityOption, quantity);
		logger.info("User select " + quantity + " seccessfully");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrderPage().addToCardBttn);
		logger.info("User clicked add to card button successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		waitTillClickable(factory.retailOrderPage().cartOption);
		Assert.assertEquals(factory.retailOrderPage().cartOption.getText(), quantity);
		logger.info("User change the quantity to " + quantity + " successfully");

		
//		waitTillPresence(factory.retailOrderPage().cartQuantity);
//		click(factory.retailOrderPage().cartQuantity);
//		List<WebElement> cartQuantity =factory.retailOrderPage().cartQuantityList;
//		for(WebElement card: cartQuantity) {
//			if(card.getText().contains("Kasa Outdoor Smart Plug")) {
//				System.out.println(card.getText());
//				Assert.assertEquals(factory.retailOrderPage().quantityField.getText(), quantity);
//				logger.info(quantity+" is selected");
//				break;
//			}
//		}

	}

	@Then("the user delete that item")
	public void theUserDeleteThatItem() throws InterruptedException {
		click(factory.retailOrderPage().cartOption);
		logger.info("User went to cart option successfully");

		click(factory.retailOrderPage().deleteBttn);
		logger.info("User clicked on delete button successfully");
		Thread.sleep(2000);
	}
	

	// scenario 2
	@When("User can click on item")
	public void userCanClickOnItem() {
		click(factory.retailOrderPage().apexItem);
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailOrderPage().cartOption);
		logger.info("User clicked on cart option successfully");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailOrderPage().proceedToChechoutBttn);
		logger.info("user clicked on Proceed to Checkout Button successfully");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailOrderPage().placeYourOrderBttn);
		logger.info("User clicked on Place Your Order successfully");
	}

	@Then("a message should be displayed about {string}")
	public void aMessageShouldBeDisplayedAbout(String message) {
		waitTillPresence(factory.retailOrderPage().orderPlacedText);
		Assert.assertEquals(factory.retailOrderPage().orderPlacedText.getText(), message);
		logger.info("A message " + message + " displayed successfully");
	}

	// Cancel order part

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailOrderPage().ordersOption);
		logger.info("User clicked on Orders section successfully");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.retailOrderPage().cancelTheOrderBttn);
		logger.info("User clicked on cancel the order button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelDropdownReason) {
		click(factory.retailOrderPage().cancelDropdown);
		selectByVisibleText(factory.retailOrderPage().cancelDropdown, cancelDropdownReason);
		logger.info("User selected the cancelation reason successfully");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailOrderPage().cancelOrderInOrderSection);
		logger.info("User clicked on Cancel Order button successfully");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelMessage) {
		waitTillPresence(factory.retailOrderPage().OrderCancelMessage);
		Assert.assertEquals(factory.retailOrderPage().OrderCancelMessage.getText(), cancelMessage);
		logger.info("A cancelation message " + cancelMessage + " displayed successfully");
	}

	// return order part

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.retailOrderPage().returnItemBttn);
		logger.info("User clicked on return item button successfully");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reasonForReturn) {
		click(factory.retailOrderPage().returnDropdown);
		selectByVisibleText(factory.retailOrderPage().returnDropdown, reasonForReturn);
		logger.info("User clicked on retrun reason " + reasonForReturn + " successfully");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String returnWhere) {
		click(factory.retailOrderPage().returnWhereDropdown);
		selectByVisibleText(factory.retailOrderPage().returnWhereDropdown, returnWhere);
		logger.info("User select the drop off the service at " + returnWhere + " successfully");
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.retailOrderPage().returnBttnInOrder);
		logger.info("User clicked on return order button successfully");
	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String returnMessage) {
		waitTillPresence(factory.retailOrderPage().reutrnSuccessfullMessage);
		Assert.assertEquals(factory.retailOrderPage().reutrnSuccessfullMessage.getText(), returnMessage);
		logger.info("A return message " + returnMessage + " was displayed successfully");
	}

	// write a review part

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailOrderPage().reviewBttn);
		logger.info("User clicked on review button successfully");
	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String reviewText) {
		sendText(factory.retailOrderPage().headlineInput, headline);
		logger.info("User wrote a headline " + headline + " successfully");
		sendText(factory.retailOrderPage().reviewTextInput, reviewText);
		logger.info("User wrote a review " + reviewText + " successfully");
	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.retailOrderPage().addYourReviewBttn);
		logger.info("User clicked on Add your review Button successfully");
	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedMessage) {
		waitTillPresence(factory.retailOrderPage().reviewAddedMessage);
		Assert.assertEquals(factory.retailOrderPage().reviewAddedMessage.getText(), reviewAddedMessage);
		logger.info("a review message " + reviewAddedMessage + " was displayed successfully");
	}

}
