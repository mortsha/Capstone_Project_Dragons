package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		// first way
//		String actualTitle = getTitle();
//		String expectedTitle = "React App";
//		Assert.assertEquals(actualTitle, expectedTitle);
//		
		// second way
		Assert.assertTrue(isElementDisplayed(factory.retailHomePage().tekschoolLogo));
		logger.info("Tekschool logo was displayed successfully");
	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.retailHomePage().allSectionBttn);
		logger.info("User clicked on All section successfully");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			Assert.assertEquals(factory.retailHomePage().electronicLink.getText(), row.get("Electronics"));
			logger.info(factory.retailHomePage().electronicLink.getText() + " was present seccessfully");
			Assert.assertEquals(factory.retailHomePage().computerLink.getText(), row.get("Computers"));
			logger.info(factory.retailHomePage().computerLink.getText() + " was present successfully");
			Assert.assertEquals(factory.retailHomePage().smartHomeLink.getText(), row.get("Smart Home"));
			logger.info(factory.retailHomePage().smartHomeLink.getText() + " was presented successfully");
			Assert.assertEquals(factory.retailHomePage().sportsLink.getText(), row.get("Sports"));
			logger.info(factory.retailHomePage().sportsLink.getText() + " was presented successfully");
			Assert.assertEquals(factory.retailHomePage().automativeLink.getText(), row.get("Automative"));
			logger.info(factory.retailHomePage().automativeLink.getText() + " was presented successfully");
		}

	}

	@When("User on {string}")
	public void userOn(String string) {
		List<WebElement> dept = factory.retailHomePage().departments;
		for(WebElement elements : dept) {
			elements.click();
			break;
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> options = dataTable.asLists(String.class);
		List<WebElement> depts = factory.retailHomePage().departments;
		for(int i = 0; i <options.get(0).size(); i++) {
			for(WebElement elements :depts ) {
				if(elements.getText().equals(options.get(0).get(i))) {
					Assert.assertTrue(elements.isDisplayed());
					logger.info(elements.getText() + "Presented ");
				}
			}
		}

	}

}
