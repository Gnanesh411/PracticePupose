package FinalKeyWord;

class Test{
	final int x=100;
}


public class FinalKeywordDemo {
	public static void main(String[] args) {
		Test t = new Test();
		//t.x=200;//incorrect,Bcoz x is final variable
		System.out.println(t.x);
		
	}
}
