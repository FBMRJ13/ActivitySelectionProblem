package IIT.java;
import java.util.Scanner;
public class ASP {
	public static void printMaxActivites(String items[], int s[], int f[],int n) {
		int i,j;
		System.out.println("Following activities are selected :");
		i=0;
		System.out.print(items[i]+ " ");
		for(j=1;j<n;j++) {
			if(s[j] >= f[i]) {
				System.out.print(items[j] + " ");
				i=j;
			}
		}
	}
	public static void main(String[] args) {
		String items[] = {"A3", "A2", "A1", "A5", "A6","A4"};
		int s[] = {1,3,0,5,8,5};
		int f[] = {2,4,6,7,9,9};
		int n = s.length;
		
		//function call
		printMaxActivites(items,s,f,n);
		
		
		
		
//		System.out.println("hello world");
//		int a=10;
//		System.out.println(a);
		//------------------->array
//		int b[] = {1,2,3,4,5};
//		for(a=0;a<b.length;a++) {
//			System.out.println(b[a]);
//		}
//		System.out.println("Enter Array elements :");
//		int[] nums = new int[5];
//		Scanner s = new Scanner(System.in);
//		for(a=0;a<nums.length;a++) {
//			nums[a] = s.nextInt();
//		}
//		System.out.println("The valuse of array are :");
//		for(a=0;a<nums.length;a++) {
//			
//			System.out.println(nums[a]);
//		}
		//------------>single string print
		
//		System.out.println("Enter name :");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println("Hello," + name + "!");
		
		
//		------------------>string array
//		System.out.println("Enter the size of string :");
//	
//		Scanner s = new Scanner(System.in);
//		int size = s.nextInt();
//		s.nextLine();
//		
//		String[] str = new String[size];
//		System.out.println("Enter "+ size + " String :");
//		for(int i=0;i<size;i++) {
//			str[i]=s.nextLine();
//		}
//		
//		System.out.println("Display :");
//		for(int i=0;i<size;i++) {
//			System.out.println(str[i]);
//			
//			
//		}
		//--------------->string concat
//		String r = "mehrin";
//		System.out.println(r);
//		System.out.println(r+ " "+ "Anannya");
//		
//		for(String i:str) {
//			System.out.println(i);
//		}
//		
//		------------------> Activity selection
		
		
		
		
	}
	

}
