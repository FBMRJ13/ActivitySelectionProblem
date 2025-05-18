package SelectionSort;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		int n,i,j,min,index;
		n=ac.nextInt();
		int array[]=new int[n];
		for(i=0;i<n;i++) {
			array[i]=ac.nextInt();
		}
		for(i=0;i<n;i++) {
			min=array[i];
			index=i;
			for(j=i;j<n;j++) {
				if(array[j]<min)
				{
					min=array[j];
					index=j;
				}
				
			}
			array[index]=array[i];
			array[i]=min;
			
		}
		for(i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		
		}
			
	}


