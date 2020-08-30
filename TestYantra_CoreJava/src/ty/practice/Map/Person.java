package ty.practice.Map;

public class Person  {
	
	int pid;
	String pname;
	int age;
	
	public Person(int pid, String pname, int age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
	
	

}
