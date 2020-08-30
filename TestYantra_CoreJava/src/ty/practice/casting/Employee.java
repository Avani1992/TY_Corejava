package ty.practice.casting;

public class Employee extends Company{
	
	static int eid;
	String ename;
	public Employee(String cname,String ename) {
		super(cname);
		this.ename = ename;
	}
	
	public void employeeinfo() {
		System.out.println("Employee name= "+this.ename);
		System.out.println("Employee id= "+Employee.eid);
	}
	
	

}
