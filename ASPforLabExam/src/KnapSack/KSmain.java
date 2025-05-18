package KnapSack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ASPlab.MyComparator;

public class KSmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		List<KnapSackProblem>list=new ArrayList<KnapSackProblem>();
		System.out.println("enter numbers of elements");
		int n;
		n=ac.nextInt();
		for(int i=1;i<=n;i++) {
			KnapSackProblem activity=new KnapSackProblem();
			System.out.println("enter the values");
			String name=ac.next();
			int profit=ac.nextInt();
			int weight=ac.nextInt();
			activity.setObject(name);
			activity.setProfit(profit);
activity.setWeight(weight);
list.add(activity);
			
			
		}
		Collections.sort(list,new KnapSack.MyComparator());
		System.out.println("enter capacity");
		n=ac.nextInt();
		int rc=n;
		double profit=0;
		
		for(int i=0;i<list.size();i++) {
			if(n==0)
				break;
			KnapSackProblem activity=list.get(i);
			if(activity.getWeight()<=n) {
				profit=profit+activity.getProfit();
				n=n-activity.getWeight();
			} else {
				
			double x=(activity.getProfit()/activity.getWeight())*n;
			n=0;
			profit=profit+x;
				
			}
			
			
		}
		System.out.println("total profit"+profit);


}
}
