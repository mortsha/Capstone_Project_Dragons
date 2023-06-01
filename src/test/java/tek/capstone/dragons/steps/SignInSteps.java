package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;
import tek.capstone.dragons.utilities.DataGenerator;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.reatialSigninPage().signinBttn);
		logger.info("User clicked on signin button successfully");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.reatialSigninPage().emailInputField, email);
		sendText(factory.reatialSigninPage().passwordInputField, password);
		logger.info("User enterd email and password successfully");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		
		click(factory.reatialSigninPage().loginBttn);
		logger.info("user clicked on login button successfully");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		waitTillPresence(factory.reatialSigninPage().accountBttn);
		Assert.assertTrue(isElementDisplayed(factory.reatialSigninPage().accountBttn));
		Assert.assertTrue(isElementDisplayed(factory.reatialSigninPage().orderLinkOption));
		Assert.assertTrue(isElementDisplayed(factory.reatialSigninPage().logoutOption));
		logger.info(" user logged in successfully");
	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.reatialSigninPage().createNewAccountBttn);
		logger.info("User clicked on create new account button successfully");
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		for(Map<String,String> row: data) {
		
			String email = DataGenerator.getEmail();
			
			sendText(factory.reatialSigninPage().nameInputFieldRegister, row.get("name"));
			sendText(factory.reatialSigninPage().emailInputFieldRegister, email);
			sendText(factory.reatialSigninPage().passInputFieldRegister, row.get("password"));
			sendText(factory.reatialSigninPage().confirmPassInputFieldRegister, row.get("confirmPassword"));
			logger.info("User filled signUp information successfully");
		}
	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.reatialSigninPage().signupBttn);
		logger.info("User clicked on SignUp button successfully");
	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.reatialSigninPage().accountBttn);
		Assert.assertTrue(isElementDisplayed(factory.reatialSigninPage().accountBttn));
		Assert.assertTrue(isElementDisplayed(factory.reatialSigninPage().orderLinkOption));
		Assert.assertTrue(isElementDisplayed(factory.reatialSigninPage().logoutOption));
		logger.info(" user logged in successfully");
//		waitTillPresence(factory.reatialSigninPage().accountBttn);
//		String expectedText = "Account";
//		String actualText = factory.reatialSigninPage().accountBttn.getText();
//		Assert.assertEquals(expectedText, actualText);
//		logger.info(actualText + " was verified successfully");
	}

}
