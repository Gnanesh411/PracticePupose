package ExceptionHandlingUnChecked;

import java.util.Scanner;

public class HandleExceptions {
	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc = new Scanner(System.in);

		// Example1

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		try {
		System.out.println(100 / num); 
		}
		catch(Exception ae){
			System.out.println("invalid data");
		}// ArithemeticException
		
		System.out.println("program is completed");
		System.out.println("program is exited.................");

	}
}
