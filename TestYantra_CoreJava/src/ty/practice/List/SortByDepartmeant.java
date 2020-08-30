package ty.practice.List;

import java.util.Comparator;

public class SortByDepartmeant implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.d.did==o2.d.did) {
			return 0;
		}else {
			if(o1.d.did<o2.d.did) {
				return -1;
			}else {
				return 1;
			}
		}
	}

}
