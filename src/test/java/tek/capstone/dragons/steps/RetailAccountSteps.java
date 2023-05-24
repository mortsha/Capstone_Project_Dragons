package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccountPage().accountBttn);
		logger.info("User clicked on Account Option successfully");
	}

	// User update the information
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.retailAccountPage().nameInputField);
//		factory.retailAccountPage().nameInputField.clear();
		sendText(factory.retailAccountPage().nameInputField, name);
		logger.info("User updated " + name + " successfully");

		clearTextUsingSendKeys(factory.retailAccountPage().phoneInputField);
//		factory.retailAccountPage().phoneInputField.clear();
		sendText(factory.retailAccountPage().phoneInputField, phone);
		logger.info("User updated " + phone + " number successfully");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.retailAccountPage().updateBttn);
		logger.info("User clicked on update button successfully");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.retailAccountPage().infoUpdateText);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().infoUpdateText));
		logger.info("User profile information updated successfully");
	}

	// User Add a payment
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailAccountPage().addPaymentLink);
		logger.info("User clicked on Add Payment method link successfully");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			sendText(factory.retailAccountPage().cardNumber, row.get("cardNumber"));
			sendText(factory.retailAccountPage().nameOnCard, row.get("nameOnCard"));
			click(factory.retailAccountPage().expirationMonth);
			selectByValue(factory.retailAccountPage().expirationMonth, row.get("expirationMonth"));
			click(factory.retailAccountPage().expirationYear);
			selectByValue(factory.retailAccountPage().expirationYear, row.get("expirationYear"));
			sendText(factory.retailAccountPage().securityCode, row.get("securityCode"));
			logger.info("User fill debit or credit card information successfully");
		}
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailAccountPage().addYourCardBttn);
		logger.info("User clicked on Add your card button successfully");
	}

	@Then("a message should be displayed on {string}")
	public void aMessageShouldBeDisplayedOn(String message) {
		if (message.contains("Payment")) {
			waitTillPresence(factory.retailAccountPage().paymentMethodMessage);
			Assert.assertEquals(factory.retailAccountPage().paymentMethodMessage.getText(), message);
			logger.info("A message of " + message + " displayed successfully");
		}
	}

	// User Update the payment
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		waitTillClickable(factory.retailAccountPage().masterCard).click();
		logger.info("User clicked on card to edit successfully");
//		String element = factory.retailAccountPage().cardOption.getText();
//		click(factory.retailAccountPage().editCardPayment);
//		if(element.equals("Master Card")) {
//			click(factory.retailAccountPage().masterCard);
//			logger.info("User have master Card");
//		}else if (element.equals("Visa Card")) {
//			click(factory.retailAccountPage().visaCard);
//			logger.info("User have visa card");
//		}
		waitTillClickable(factory.retailAccountPage().editCardPayment).click();
		logger.info("User clicked on Edit option of card section successfully");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			factory.retailAccountPage().cardNumber.clear();
			sendText(factory.retailAccountPage().cardNumber, row.get("cardNumber"));
			factory.retailAccountPage().nameOnCard.clear();
			sendText(factory.retailAccountPage().nameOnCard, row.get("nameOnCard"));
			click(factory.retailAccountPage().expirationMonth);
			selectByValue(factory.retailAccountPage().expirationMonth, row.get("expirationMonth"));
			click(factory.retailAccountPage().expirationYear);
			selectByValue(factory.retailAccountPage().expirationYear, row.get("expirationYear"));
			factory.retailAccountPage().securityCode.clear();
			sendText(factory.retailAccountPage().securityCode, row.get("securityCode"));
			logger.info("User fill debit or credit card information successfully");
		}
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailAccountPage().updateYourCardBttn);
	}

	@Then("a message should be displayed for edit {string}")
	public void aMessageShouldBeDisplayedForEdit(String message) {
		waitTillPresence(factory.retailAccountPage().updateMethodPaymentMessage);
		Assert.assertEquals(factory.retailAccountPage().updateMethodPaymentMessage.getText(), message);
		logger.info("A message " + message + " was displayed successfully");
	}

	// User removed

	@When("User select the card ending with {string}")
	public void userSelectTheCardEndingWith(String string) {
		List<WebElement> cards = factory.retailAccountPage().cardEnding;
		for (WebElement card : cards) {
			if (card.getText().contains(string)) {
				System.out.println(card.getText());
				click(card);
				logger.info(string + " is selected");
				break;
			}
		}
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.retailAccountPage().removeCard);
		logger.info("User clicked on remove option successfully");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("Payment method removed");
		// what should I do?

	}

	// User add address
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailAccountPage().addAddressBttn);
		logger.info("User clicked on Add address option successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			click(factory.retailAccountPage().countryDropdown);
			selectByVisibleText(factory.retailAccountPage().countryDropdown, row.get("country"));
//			factory.retailAccountPage().fullNameAddressField.clear();
			sendText(factory.retailAccountPage().fullNameAddressField, row.get("fullName"));
//			factory.retailAccountPage().phoneNumberAddressField.clear();
			sendText(factory.retailAccountPage().phoneNumberAddressField, row.get("phoneNumber"));
//			factory.retailAccountPage().streetAddressField.clear();
			sendText(factory.retailAccountPage().streetAddressField, row.get("streetAddress"));
//			factory.retailAccountPage().apartmentAddressField.clear();
			sendText(factory.retailAccountPage().apartmentAddressField, row.get("apt"));
//			factory.retailAccountPage().cityAddressField.clear();
			sendText(factory.retailAccountPage().cityAddressField, row.get("city"));
			click(factory.retailAccountPage().stateDropdown);
			selectByVisibleText(factory.retailAccountPage().stateDropdown, row.get("state"));
//			factory.retailAccountPage().zipCodeAddressField.clear();
			sendText(factory.retailAccountPage().zipCodeAddressField, row.get("zipCode"));

			logger.info("User filled address with information successfully");

		}
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailAccountPage().addYourAddressBttn);
		logger.info("User clicked on Add address button successfully");
	}

	@Then("a message should be displayed for add address {string}")
	public void aMessageShouldBeDisplayedForAddAddress(String message) {
		waitTillPresence(factory.retailAccountPage().addressAddedMessage);
		Assert.assertEquals(factory.retailAccountPage().addressAddedMessage.getText(), message);
		logger.info("A message " + message + " displayed successfully");
	}

	// User edit the address
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailAccountPage().editAdressBttn);
		logger.info("User clicked on edit address option successfully");
	}

	@When("user fill the new address form with below information")
	public void userFillTheNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			click(factory.retailAccountPage().countryDropdown);
			selectByVisibleText(factory.retailAccountPage().countryDropdown, row.get("country"));
			factory.retailAccountPage().fullNameAddressField.clear();
			sendText(factory.retailAccountPage().fullNameAddressField, row.get("fullName"));
			factory.retailAccountPage().phoneNumberAddressField.clear();
			sendText(factory.retailAccountPage().phoneNumberAddressField, row.get("phoneNumber"));
			factory.retailAccountPage().streetAddressField.clear();
			sendText(factory.retailAccountPage().streetAddressField, row.get("streetAddress"));
			factory.retailAccountPage().apartmentAddressField.clear();
			sendText(factory.retailAccountPage().apartmentAddressField, row.get("apt"));
			factory.retailAccountPage().cityAddressField.clear();
			sendText(factory.retailAccountPage().cityAddressField, row.get("city"));
			click(factory.retailAccountPage().stateDropdown);
			selectByVisibleText(factory.retailAccountPage().stateDropdown, row.get("state"));
			factory.retailAccountPage().zipCodeAddressField.clear();
			sendText(factory.retailAccountPage().zipCodeAddressField, row.get("zipCode"));

			logger.info("User filled address with information successfully");

		}
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailAccountPage().updateYourAddressBttn);
		logger.info("User clicked on update your address button successfully");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String addressUpdated) {
		waitTillPresence(factory.retailAccountPage().addressUpdatedMessage);
		Assert.assertEquals(factory.retailAccountPage().addressUpdatedMessage.getText(), addressUpdated);
		logger.info(addressUpdated + " : showed successfully");
	}

	// User Removed address
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccountPage().removeAddressBttn);
		logger.info("User clicked on remove option successfully");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	}

}
