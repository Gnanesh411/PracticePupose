package This_Static_KeyWords;

import org.testng.reporters.jq.Main;

public class StaticDemo {
	static int a = 10;// static variable
	int b = 20;// non-static variable

	static void m1(){// static
		int a=10;
		System.out.println("this is m1 static method.....");
		System.out.println(a);
	}

	void m2() {// non-static method
		System.out.println("this is m2 non-static method....");
	}
	
	void m() {//non static method
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	
	}
	public static void main(String[] args) {
		
	}

//	public static void main(String[] args) {
//		//1)static method can access static stuff directlty(with out object)
//		System.out.println(a);
//		m1();
//		//System.out.println(b); //cannot access,b is non static variable
//		//m2();//cannot access, m2()is non static method
//		
//		//2)static methods can access non-static stuff through object
//		StaticDemo sd = new StaticDemo();
//		System.out.println(sd.b);
//		sd.m2();
//		
//		//3)non-static method can access everything directly. no ristricted.
//		sd.m();
//	}
}
