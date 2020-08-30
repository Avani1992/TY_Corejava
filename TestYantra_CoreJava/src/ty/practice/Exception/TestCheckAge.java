package ty.practice.Exception;

public class TestCheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckAge ca=new CheckAge();
		ca.checkage(34);
		System.out.println("==========================================");
		try {
			
			ca.checkage(14);
		} catch (AgeException  e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=====================================");
		ca.checkage(12); // without try..catch..
	}

}
