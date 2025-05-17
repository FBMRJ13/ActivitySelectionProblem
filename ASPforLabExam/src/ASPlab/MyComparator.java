package ASPlab;

import java.util.Comparator;

public class MyComparator implements Comparator<ActivitySelectionProblem> {

	@Override
	public int compare(ActivitySelectionProblem o1, ActivitySelectionProblem o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getFinish(), o2.getFinish());
	}

}
