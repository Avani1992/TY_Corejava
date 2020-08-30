package ty.practice.Set;

public class Employee implements Comparable<Employee>{
	
	int eid;
	String ename;
	double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.ename.compareTo(o.ename);
	}
	
	
	

}
