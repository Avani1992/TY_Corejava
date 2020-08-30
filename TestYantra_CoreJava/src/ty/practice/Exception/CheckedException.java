package ty.practice.Exception;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			
			Class.forName("ty.corejava.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
