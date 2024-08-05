package Abstract_Interface;

interface Shape {

	int lenght = 10;// final and static
	int width = 20;// final and static

	void circle();// abstract method it is public by default

	default void square() {
		System.out.println("This is default method");
	}

	static void rectangle() {
		System.out.println("this is static method");
	}
}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("abstarct method implementation");
	}
	void triangle() {
		System.out.println("this is triangle");
	}

	public static void main(String[] args) {
		
		//Scenario-1
		InterfaceDemo id = new InterfaceDemo();
//		id.circle();
//		id.square();
		id.triangle();
//		Shape.rectangle();//static method can directly access from interface.
		
		//Scenario-2
		Shape s = new InterfaceDemo();
		s.circle();
		s.square();
		Shape.rectangle();
		//s.triangle();//we cant access
		System.out.println(Shape.lenght * Shape.width);//accessing static variables directly
		
	}	
}