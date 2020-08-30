package ty.practice.inheritance1;

public class Patent {

	int pid;
	String pname;
	
	public Patent(int pid, String pname) {
		
		this.pid = pid;
		this.pname = pname;
	}
	
	public void patentinfo() {
		
		System.out.println("Pid= "+this.pid);
		System.out.println("Pname= "+this.pname);
	}
	
}
