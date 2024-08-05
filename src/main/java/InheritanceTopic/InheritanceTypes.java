package InheritanceTopic;

class A // parent class single inheritance
{
	int a;

	void display() {
		System.out.println(a);
	}
}

class B extends A {// child class
	int b;

	void show() {
		System.out.println(b);
	}
}
class C extends B{//C:B+A child of B multilevel inheritance
	int c;
	void print() {
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		/*
		 * B b = new B(); System.out.println(b.a); System.out.println(b.b); b.display();
		 * b.show();
		 */
		C c = new C();
		c.a=100;
		c.b=200;
		c.c=300;
		
		c.display();
		c.show();
		c.print();
	}
}
