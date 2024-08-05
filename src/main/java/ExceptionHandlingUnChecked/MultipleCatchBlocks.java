package ExceptionHandlingUnChecked;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		System.out.println("program is started....");
		String s = null;
		try {
		System.out.println(s.length());
		}
		catch(ArithmeticException ae) {
			System.out.println("HandleException....");
			System.out.println(ae.getMessage());
		}
		catch(NullPointerException ne) {
			System.out.println("HandleException....");
			System.out.println(ne.getMessage());
		}
		catch(NumberFormatException nf) {
			System.out.println("HandleException....");
			System.out.println(nf.getMessage());
		}
		System.out.println("program finished....");
	}
}
