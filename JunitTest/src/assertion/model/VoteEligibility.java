package assertion.model;

public class VoteEligibility {
	
	public static boolean eligibletovote(int age) {
		if(age<18) {
			return false;
		}
		return true;
	}

}
