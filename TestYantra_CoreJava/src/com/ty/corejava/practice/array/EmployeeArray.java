/*WAP to print the employees from Employee[] array who has
same salary (Create Employee class which has 3 attributes id, name,
salary and add employee objects to your array)

 * */
package com.ty.corejava.practice.array;

public class EmployeeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e[]=new Employee[4];
		e[0]=new Employee(10,"ABC",23000);
		e[1]=new Employee(20,"BCD",25000);
		e[2]=new Employee(30,"CDE",23000);
		e[3]=new Employee(40,"DEF",22000);
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++ ) {
				
				if(e[i].salary==e[j].salary) {
				
					System.out.println(e[i]);
					System.out.println(e[j]);
			}}
		}
	}

}
