package ty.practice.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Ravi",new Department(101,"CE")));
		al.add(new Student(2,"Kajal",new Department(102,"EC")));
		al.add(new Student(3,"Ami",new Department(101,"CE")));
		al.add(new Student(4,"Dipa",new Department(103,"ME")));
		al.add(new Student(5,"Sifa",new Department(102,"EC")));
		
		System.out.println(al);
//		System.out.println("==========sortByDid===============");
//		Collections.sort(al,new SortByDepartmeant());
//		System.out.println(al);
		
//		System.out.println("==========sortByname===============");
//		Collections.sort(al,new SortByname());
//		System.out.println(al);
		
		System.out.println("==========sortByDname===============");
		Collections.sort(al);  // comparable
		System.out.println(al);
		
		

		
	}

}
