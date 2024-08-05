package MethodOverriding;

class Bank{
	double roi() {
		return 0;
		
	}
}
class ICICI extends Bank{
	double roi() {
		return 10.5;		
	}
}
class SBI extends Bank{
	double roi() {
		return 11.5;	
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		double roi = ic.roi();
		System.out.println(roi);
		
		SBI sb = new SBI();
		double roi1 = sb.roi();
		System.out.println(roi1);
	}
}
