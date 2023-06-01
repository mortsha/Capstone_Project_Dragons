package tek.capstone.dragons.utilities;

public class DataGenerator {
	
	
	public static String getPhoneNumber() {
		String phoneNumber = "9";
		for (int i = 0; i < 9; i++) {
			phoneNumber += (int) (Math.random() * 10);
		}
		return phoneNumber;
	}
	
	public static String getEmail() {
		String email = "Smile";
		String provider = "@Canada.com";
		int randomNumber = (int) (Math.random() * 10000);
		String autoEmail = email + randomNumber + provider;
		return autoEmail;
	}

}
