package custom;

public class ValidationMain {

	public static void main(String[] args) {

		Validation v = new Validation();

		try {
			if (v.isValidAge(41)) {
				System.out.println("Age Validated");
			}
		} catch (BusinessCheckedException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (v.isValidMobileNumber("+1-1234567890")) {
				System.out.println("Mobile Number validated");
			}
		} catch (BusinessUncheckedException e) {
			System.out.println(e.getMessage());
		}

	}

}
