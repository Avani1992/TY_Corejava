package ty.practice.casting;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c=new Employee("IBM", "Raj");
		Company.eyear=1994;
		c.companyinfo();
		
		Employee e=(Employee) c;
		Employee.eid=1001;
		e.employeeinfo();

	}

}
