package Methods_Constructors;

public class Greetings {
	//1) No Parms No return value
	
	void m1(){
		System.out.println("Hello.................");
	}
	
	//2)No Parms But Return Value
	
	String m2() {
		return("Hello.........");
	}
	
	//3)Takes parms no return type
	
	void m3(String name) {
		System.out.println("Hello "+name);
	}
	
	//4)Take parms and return type
	
	String m4(String name){
		return("Hello"+name);
	}
	
}