package tek.capstone.dragons.pages;

public class POMFactory {

	private RetailHomePage retailHomePage;
	private RetailSignInPage retailSigninPage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	
	public POMFactory() {
	this.retailHomePage = new RetailHomePage();	
	this.retailSigninPage = new RetailSignInPage();
	this.retailAccountPage = new RetailAccountPage();
	this.retailOrderPage = new RetailOrderPage();
	}
	
	// get method
	public RetailHomePage retailHomePage() {
		return this.retailHomePage;
	}
	public RetailSignInPage reatialSigninPage() {
		return this.retailSigninPage;
	}
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}

}
