package ExceptionHandlingUnChecked;

import java.util.Scanner;

public class ExceptionUnCheckedDemo {
	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc = new Scanner(System.in);
		
		//Example1
		/*
		 * System.out.println("Enter a number:"); int num = sc.nextInt();
		 * System.out.println(100/num); //ArithemeticException
		 */
		
		//Example2
		/*int a[] = new int[5];
		
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value; //ArrayIndexoutOfBoundsExcption
		System.out.println(a[pos]);*/
		
		//Example3
		/*
		 * String s = "ABC"; int num = Integer.parseInt(s);//Number Format exception
		 * System.out.println(num);
		 */
		
		//Example4
		
		String s=null;
		System.out.println(s.length());//NullPointerException
		
		
		System.out.println("program is completed");
		System.out.println("program is exited.................");
		
	}
}
