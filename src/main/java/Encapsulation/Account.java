package Encapsulation;

public class Account {
	private String accno;
	private String name;
	private double amount;

	public String getAccno() {
		return accno;
	}

	public void setAccno(String string) {
		this.accno = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
