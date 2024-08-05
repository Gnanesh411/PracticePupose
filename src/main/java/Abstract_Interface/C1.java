package Abstract_Interface;

public class C1 extends C2 implements I1,I2 {
	public static void main(String[] args) {
		C1 c = new C1();
		I1 i = new C1();
		i.m1();
		c.m1();
		c.m2();
		c.m3();
	}

	@Override
	public void m2() {
		System.out.println(y);
	}

	@Override
	public void m1() {
		System.out.println(x);
		
	}
}
