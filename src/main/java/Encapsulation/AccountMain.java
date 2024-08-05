package Encapsulation;

public class AccountMain {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccno("33344462278");
		acc.setName("Gnanesh");
		acc.setAmount(900000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}
}
