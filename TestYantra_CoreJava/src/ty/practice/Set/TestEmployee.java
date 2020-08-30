package ty.practice.Set;

import java.util.Collections;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> tr=new TreeSet<>(new SortBySalary());
		tr.add(new Employee(101,"Raj",40000));
		tr.add(new Employee(105,"Suresh",34000));
		tr.add(new Employee(102,"Sneha",67000));
		tr.add(new Employee(104,"Ruchi",12000));
		tr.add(new Employee(103,"Kirit",23000));
		
		
		
		System.out.println(tr);

	}

}
