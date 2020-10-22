package custom;

public class Validation {

	
	public boolean isValidAge(int age) throws BusinessCheckedException {
		
		if(age<=0) {
			throw new BusinessCheckedException("Age cannot be zero or -ve");
		}
		
		if(age<19 || age >40) {
			throw new BusinessCheckedException("Age should be between 19 and 40 only");
		}
		
		return true;
	}
	
	public boolean isValidMobileNumber(String mobile) {
		
		if(!mobile.matches("\\+1-[0-9]{10}")) {
			throw new BusinessUncheckedException("Entered mobile number "+mobile+" is Invalid");
		}
		
		return true;
	}
}
