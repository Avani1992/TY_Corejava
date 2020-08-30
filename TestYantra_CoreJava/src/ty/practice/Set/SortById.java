package ty.practice.Set;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		 if(o1.eid==o2.eid) {
			return 0;
		}else {
			if(o1.eid<o2.eid) {
				return -1;
			}else {
				return 1;
			}
		}
	}

}
