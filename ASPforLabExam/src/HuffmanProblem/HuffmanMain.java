

package HuffmanProblem;

import java.util.PriorityQueue;
import java.util.Scanner;
public class HuffmanMain {
 static int total=0;
public static void print(HuffmanNode root,String s) {
	if(root.left==null && root.right==null) {
		System.out.println(root.c+" : "+s);
		total=total+s.length();
		return;
		
	}
	print(root.left,s+"0");
	print(root.right,s+"1");
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ac=new Scanner(System.in);
int n,i;
System.out.println("enter arraySize");
n=ac.nextInt();
int[] freA=new int[n];
char[] charA=new char[n];
for(i=0;i<n;i++) {
	System.out.println("enter character and frequency");
	charA[i]=ac.next().charAt(0);
	freA[i]=ac.nextInt();
	
}
PriorityQueue<HuffmanNode>q=new PriorityQueue<HuffmanNode>(n, new MyComparator());
for(i=0;i<n;i++) {
	
	HuffmanNode acti=new HuffmanNode();
	acti.c=charA[i];
	acti.data=freA[i];
	acti.left=null;
	acti.right=null;
	q.add(acti);
}
HuffmanNode root=null;
while(q.size()>1) {
	
	HuffmanNode x,y;
	x=q.peek();
	q.poll();
	y=q.peek();
	q.poll();
	
	HuffmanNode f=new HuffmanNode();
	f.data=x.data+y.data;
	f.left=x;
	f.right=y;
	q.add(f);
	root=f;
}
		
	print(root,"");	
	System.out.println(total);
		
		
	}

}
