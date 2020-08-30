package ty.practice.Map;

import java.util.TreeMap;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Person, Integer> t1=new TreeMap<>(new SortByname() );
		t1.put(new Person(1,"Ruchi",23), 10);
		t1.put(new Person(3,"Mihir",35), 50);
		t1.put(new Person(2,"Raj",10), 60);
		t1.put(new Person(5,"Vraj",13), 90);
		t1.put(new Person(4,"Usha",45), 50);
		
		System.out.println(t1);
		

	}

}
