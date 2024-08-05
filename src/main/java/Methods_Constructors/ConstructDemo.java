package Methods_Constructors;

public class ConstructDemo {
	int x, y;

	ConstructDemo() {
		x = 100;
		y = 200;
	}

	ConstructDemo(int a, int b) {
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		ConstructDemo cd = new ConstructDemo();// invoke default constructor
		ConstructDemo cd1 = new ConstructDemo(10, 20);// parameterised constructor
		cd1.sum();
		cd.sum();
	}
}