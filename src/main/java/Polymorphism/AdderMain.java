package Polymorphism;

public class AdderMain extends Adder {
	public static void main(String[] args) {
		Adder add = new Adder();
		add.sum();//1
		add.sum(1, 2);//2
		add.sum(1, 5.4);//3
		add.sum(5.3, 5);//4
		add.sum(1, 2, 3);
	}
}
