package Methods_Constructors;

public class Greetings_MainClass {
	public static void main(String[] args) {
		Greetings gr = new Greetings();
		gr.m1(); // 1
		String s = gr.m2();
		System.out.println(s);
		gr.m3("Gnanesh");
		String s1 = gr.m4("Gnanesh");
		System.out.println(s1);
	}
}
