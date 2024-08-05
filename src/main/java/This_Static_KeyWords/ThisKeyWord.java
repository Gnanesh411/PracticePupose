package This_Static_KeyWords;

public class ThisKeyWord {
	int x,y;//class variables/instance variables
	
	/*
	 * ThisKeyWord(int x,int y){ this.x=x; this.y=y; }
	 */
	void setData(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		//ThisKeyWord t = new ThisKeyWord(3, 5);
		ThisKeyWord t = new ThisKeyWord();
		t.setData(100, 200);
		t.display();
	}
}
