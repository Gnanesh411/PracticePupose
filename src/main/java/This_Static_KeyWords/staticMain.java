package This_Static_KeyWords;

public class staticMain {
	public static void main(String[] args) {
		//1)static method can access static stuff directlty(with out object)
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		//System.out.println(b); //cannot access,b is non static variable
		//m2();//cannot access, m2()is non static method
		
		//2)static methods can access non-static stuff through object
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		//3)non-static method can access everything directly. no ristricted.
		sd.m();
	}
}
