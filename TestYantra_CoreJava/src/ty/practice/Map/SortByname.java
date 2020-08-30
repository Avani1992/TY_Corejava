package ty.practice.Map;

import java.util.Comparator;

public class SortByname implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.pname.compareTo(o2.pname);
	}

}
