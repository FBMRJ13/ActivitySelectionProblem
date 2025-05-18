package KnapSack;

import java.util.Comparator;

public class MyComparator implements Comparator<KnapSackProblem> {

	@Override
	public int compare(KnapSackProblem a, KnapSackProblem b) {
		// TODO Auto-generated method stub
		double r1=(double)a.getProfit()/a.getWeight();
		double r2=(double)b.getProfit()/b.getWeight();
		
		return Double.compare(r2, r1);
	}

	

}
