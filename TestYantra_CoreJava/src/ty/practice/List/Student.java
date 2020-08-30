package ty.practice.List;

public class Student implements Comparable<Student>{

	int sid;
	String name;
	Department d;
	public Student(int sid, String name, Department d) {
		super();
		this.sid = sid;
		this.name = name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", did=" + d.did + ",dname=" +d.dname+"]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.d.dname.compareTo(o.d.dname);
	}
	
	
}
