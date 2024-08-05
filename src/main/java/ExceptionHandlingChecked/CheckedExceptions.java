package ExceptionHandlingChecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException  {

		System.out.println("program started.....");
		System.out.println("program in progress....");
		
		Thread.sleep(3000);
		
		FileInputStream fis = new FileInputStream("C:\\TEXT.TXT");
//		
//		try {
//		Thread.sleep(3000);
//		}
//		catch(InterruptedException e) {
//			
//		}
		
		System.out.println("program fineshed....");
		System.out.println("program exited....");	
	}
}
