package ty.practice.casting;

public class Company {
	
	String cname;
	 static int eyear;
	
	public Company(String cname) {
		this.cname=cname;
		
	}
	
	public void companyinfo() {
		System.out.println("Company name= "+this.cname);
		System.out.println("Company Est. Year= "+Company.eyear);
	}

}
