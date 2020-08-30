package ty.practice.Exception;

public class AgeException extends RuntimeException {
	
	String msg="Age must be greater than 18..";
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}

}
