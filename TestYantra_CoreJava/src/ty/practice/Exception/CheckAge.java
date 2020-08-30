package ty.practice.Exception;

public class CheckAge  {
	
	public void checkage(int age) {
		if(age<18) {
			throw new AgeException();
		}
		else {
			System.out.println("You r eligible for voting..");
		}
	}

}
